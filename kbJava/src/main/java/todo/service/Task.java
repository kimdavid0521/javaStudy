package todo.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
// comparable: 기본 정렬 기준 설정하는 인터페이스(Treeset에서 이용)
public class Task implements Comparable<Task>{
    private int priority; // 할일 우선순위 (1~5, 1이 높음)
    private String content; // 할일 내용


    @Override
    public String toString() {
        return "[우선순위:" + priority + "]" + content;
    }

    @Override
    public int compareTo(Task other) {

        int priorityCompare = this.priority - other.priority;
        if (priorityCompare != 0) {
            return priorityCompare; // 양수: 자리바꿈 , 음수: 유지
        }

        // 우선순위가 같으면 content 오름 차순으로 정렬
        return this.content.compareTo(other.content);
    }
}
