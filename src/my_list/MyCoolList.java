package my_list;

//Список целых чисел
public interface MyCoolList {
    int size();
    boolean isEmpty();
    void add(int number);
    void get(int index);
    void set(int index, int number);
}
