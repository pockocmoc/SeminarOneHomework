package task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyProgramTest {

    @Test
    void solutionOne() {
        assertEquals(10, MyProgram.solution(4));
    }

    @Test
    void solutionTwo() {
        assertEquals(6, MyProgram.solution(3));
    }

    @Test
    void solutionThree() {
        assertEquals(3, MyProgram.solution(2));
    }

    @Test
    void solutionFour() {
        assertEquals(1, MyProgram.solution(1));
    }

}