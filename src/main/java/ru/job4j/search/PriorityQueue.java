package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            /* сравниваем приоритет element с приоритетом task */
            if (element.getPriority() > task.getPriority()) {
                /* Если приоритет больше у element, прервать цикл */
                break;
            }
            /* если приоритет больше у task, index увеличить на 1 */
            index++;
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}

