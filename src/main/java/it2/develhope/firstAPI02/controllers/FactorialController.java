package it2.develhope.firstAPI02.controllers;

import com.google.common.math.BigIntegerMath;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@RestController
public class FactorialController {


    @GetMapping("/factorial/{n}")
    public BigInteger factorialUsingGuava(@PathVariable int n) {
        return BigIntegerMath.factorial(n);
    }
}
