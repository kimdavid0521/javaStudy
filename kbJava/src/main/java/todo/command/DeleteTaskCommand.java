package todo.command;

import todo.service.Task;
import todo.service.TaskManager;

import java.util.List;

public class DeleteTaskCommand implements Command {

    private TaskManager taskManager;
    private Task task;

    // 삭제 커맨드 생성자
    public DeleteTaskCommand(TaskManager taskManager, int index) {
        this.taskManager = taskManager;

        // 할 일 목록 List 형태로 얻어오기
        List<Task> tasks = taskManager.getTasksAsList();

        // index가 정상 범위인 경우
        if (index >= 0 && index < tasks.size()) {
            this.task = tasks.get(index);
        } else {
            throw new IndexOutOfBoundsException("유효하지 않은 할 일 번호입니다.");
        }
    }

    @Override
    public void excute() {
        taskManager.removeTask(task);
    }

    @Override
    public void undo() {
        taskManager.addTask(task);
        System.out.println("할 일 삭제가 취소되었습니다.");
    }
}
