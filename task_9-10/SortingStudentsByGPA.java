package task_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class SortingStudentsByGPA implements Comparator {
    private ArrayList<Student> IDNumber;
    public SortingStudentsByGPA(){
        this.IDNumber = new ArrayList<>();
    }
    public void setArray(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i ++) {
            String Name = scanner.nextLine();
            String Second_name = scanner.nextLine();
            String Special = scanner.nextLine();
            Integer Curs = Integer.valueOf(scanner.nextLine());
            Integer FinMark = Integer.valueOf(scanner.nextLine());
            IDNumber.add(new Student(Name, Second_name, Special, Curs,
                    FinMark));
        }
    }


    public void quicksort(int i) {
        if (IDNumber.isEmpty()) return;
        quicksort(0, IDNumber.size() - 1, i);
    }
    public void quicksort(int low, int high, int tur) {
        if (low < high) {
            int pi = partition(low, high, tur);
            quicksort(low, pi - 1, tur);
            quicksort(pi + 1, high, tur);
        }
    }

    private int partition(int low, int high, int tur) {
        double pivot1 = IDNumber.get(high).getCurs();
        double pivot = IDNumber.get(high).getFinalMark();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // Сравниваем по убыванию (больший GPA идет первым)
            if (tur == 1) {
                if (IDNumber.get(j).getFinalMark() >= pivot) {
                    i++;
                    Collections.swap(IDNumber, i, j);
                }
            }
            if (tur == 2){
                if (IDNumber.get(j).getCurs() >= pivot1) {
                    i++;
                    Collections.swap(IDNumber, i, j);
                }
            }
        }
        Collections.swap(IDNumber, i + 1, high);
        return i + 1;
    }

    public void mergeSort() {
        if (IDNumber.isEmpty()) return;
        mergeSort(0, IDNumber.size() - 1);
    }

    private void mergeSort(int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(left, mid);
            mergeSort(mid + 1, right);
            merge(left, mid, right);
        }
    }

    private void merge(int left, int mid, int right) {
        ArrayList<Student> temp = new ArrayList<>();
        int i = left, j = mid + 1;

        while (i <= mid && j <= right) {
            if (IDNumber.get(i).getFinalMark() >= IDNumber.get(j).getFinalMark()) {
                temp.add(IDNumber.get(i));
                i++;
            } else {
                temp.add(IDNumber.get(j));
                j++;
            }
        }

        while (i <= mid) {
            temp.add(IDNumber.get(i));
            i++;
        }

        while (j <= right) {
            temp.add(IDNumber.get(j));
            j++;
        }

        for (int k = 0; k < temp.size(); k++) {
            IDNumber.set(left + k, temp.get(k));
        }
    }

    public void outArray(){
        System.out.println("Список студентов:");
        for (int i = 0; i < IDNumber.size(); i++) {
            System.out.println((i + 1) + ". " + IDNumber.get(i));
        }
        System.out.println();
    }

    static void main() {
        SortingStudentsByGPA sorted = new SortingStudentsByGPA();
        System.out.println("Заполняем массив студентами");
        sorted.setArray();
        sorted.outArray();

        System.out.println("После быстрой сортировки по баллу (по убыванию):");
        sorted.quicksort(1);
        sorted.outArray();

        System.out.println("Перемешиваем массив");
        Collections.shuffle(sorted.IDNumber);
        sorted.outArray();

        System.out.println("После сортировки слиянием по баллу (по убыванию):");
        sorted.mergeSort();
        sorted.outArray();

        System.out.println("Перемешиваем массив");
        Collections.shuffle(sorted.IDNumber);
        sorted.outArray();

        System.out.println("После быстрой сортировки по номеру курса (по убыванию):");
        sorted.quicksort(2);
        sorted.outArray();

    }
}
