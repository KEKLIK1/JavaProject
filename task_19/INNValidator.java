package task_19;

public class INNValidator {

    public static void validateINN(Client client) throws InvalidINNException {
        String inn = client.getInn();

        if (inn == null || inn.trim().isEmpty()) {
            throw new InvalidINNException("ИНН не может быть пустым");
        }


        if (!inn.matches("\\d+")) {
            throw new InvalidINNException("ИНН должен содержать только цифры");
        }

        if (inn.length() != 10 && inn.length() != 12) {
            throw new InvalidINNException("ИНН должен содержать 10 или 12 цифр");
        }

        if (!checkControlSum(inn)) {
            throw new InvalidINNException("Неверная контрольная сумма ИНН");
        }

    }

    private static boolean checkControlSum(String inn) {
        try {
            if (inn.length() == 10) {
                return checkControlSum10(inn);
            } else {
                return checkControlSum12(inn);
            }
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean checkControlSum10(String inn) {
        int[] coefficients = {2, 4, 10, 3, 5, 9, 4, 6, 8};
        int controlSum = 0;

        for (int i = 0; i < 9; i++) {
            controlSum += Character.getNumericValue(inn.charAt(i)) * coefficients[i];
        }

        int controlNumber = controlSum % 11;
        controlNumber = controlNumber % 10;

        return controlNumber == Character.getNumericValue(inn.charAt(9));
    }

    private static boolean checkControlSum12(String inn) {

        int[] coefficients1 = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int controlSum1 = 0;

        for (int i = 0; i < 10; i++) {
            controlSum1 += Character.getNumericValue(inn.charAt(i)) * coefficients1[i];
        }

        int controlNumber1 = controlSum1 % 11;
        controlNumber1 = controlNumber1 % 10;

        if (controlNumber1 != Character.getNumericValue(inn.charAt(10))) {
            return false;
        }

        int[] coefficients2 = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int controlSum2 = 0;

        for (int i = 0; i < 11; i++) {
            controlSum2 += Character.getNumericValue(inn.charAt(i)) * coefficients2[i];
        }

        int controlNumber2 = controlSum2 % 11;
        controlNumber2 = controlNumber2 % 10;

        return controlNumber2 == Character.getNumericValue(inn.charAt(11));
    }


}