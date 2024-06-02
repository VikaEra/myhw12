
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

public class TasksTest {

    @Test
    public void testTrueSimpleTask() {
        SimpleTask Str = new SimpleTask(5, "Позвонить родителям");

        System.out.println(Str.matches( "Позвонить родителям"));
    }

    @Test
    public void testFalseSimpleTask() {
        SimpleTask Str = new SimpleTask(5, "Позвонить родителям");

        System.out.println(Str.matches("Позвонить друзьям"));
    }

    @Test
    public void testTrueEpic() {
        String[] subtask = {"Кефир", "Яйца", "Хлеб"};
        Epic Str = new Epic(55, subtask);

        System.out.println(Str.matches("\"Кефир\", \"Яйца\", \"Хлеб\""));
    }

    @Test
    public void testFalseEpic() {
        String[] subtask = {"Кефир", "Яйца", "Хлеб"};
        Epic Str = new Epic(55, subtask);

        System.out.println(Str.matches("\"Молоко\", \"Масло\", \"Соль\""));
    }

    @Test
    public void testTrueMeeting() {
        Meeting Str = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        System.out.println(Str.matches("Выкатка 3й версии приложения"));
    }

    @Test
    public void testFalseMeeting() {
        Meeting Str = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        System.out.println(Str.matches("Версия приложения"));
    }
}




