package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class Addition {

    @Autowired
    Calci calci;

    @PostMapping("/add")
    public ResponseEntity<Result> addNumbers(@RequestBody TwoNumbers twoNumbers) {
        long result = calci.add(twoNumbers.getNum1(), twoNumbers.getNum2());
        Result result1 = new Result(twoNumbers.getNum1(), twoNumbers.getNum2(), result);
        return ResponseEntity.ok(result1);
    }

    public static class Result {
        private long num1;
        private long num2;
        private long sum;

        public Result(long num1,long num2,long sum) {
            this.num1=num1;
            this.num2=num2;
            this.sum = sum;
        }

        public long getSum() {
            return sum;
        }

        public void setSum(long sum) {
            this.sum = sum;
        }

        public long getNum1() {
            return num1;
        }

        public long getNum2() {
            return num2;
        }

        public void setNum1(long num1) {
            this.num1 = num1;
        }

        public void setNum2(long num2) {
            this.num2 = num2;
        }
    }



}
