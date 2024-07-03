package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        //MyLinkedList<Integer> list = new MyLinkedList<>(); // 링크드 리스트가 훨씬 빠름
        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);
    }
}
