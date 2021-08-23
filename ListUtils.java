import lombok.SneakyThrows;

import java.util.List;


public class ListUtils {
    public static <T> void forEachWithDelay(List<T> list, int delay, Consumer<T> consumer){
        list.forEach(t -> {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
		consumer.accept(t);});
    }

}