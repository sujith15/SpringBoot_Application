package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class AddControllerTest {

    @Mock
    private Addition addition;

    private AddController addController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        addController = new AddController();
        addController.addition = addition;
    }

    @Test
    void testAddNumbers() {
        long num1 = 5;
        long num2 = 10;
        long sum = 15;

        when(addition.add(num1, num2)).thenReturn(sum);

        AddController.Result expectedResult = new AddController.Result(num1, num2, sum);
        ResponseEntity<AddController.Result> expectedResponse = ResponseEntity.ok(expectedResult);

        TwoNumbers twoNumbers = new TwoNumbers();
        twoNumbers.setNum1(num1);
        twoNumbers.setNum2(num2);
        ResponseEntity<AddController.Result> actualResponse = addController.addNumbers(twoNumbers);

        assertEquals(expectedResponse.getBody().getNum1(), actualResponse.getBody().getNum1());
        assertEquals(expectedResponse.getBody().getNum2(), actualResponse.getBody().getNum2());
        assertEquals(expectedResponse.getBody().getSum(), actualResponse.getBody().getSum());
    }
}
