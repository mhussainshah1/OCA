package practice_test.ch06.employee;

import static practice_test.ch06.commerce.Bank.*;

public class Teller {

    public void processAccount(int depositSlip, int withdrawalSlip) {
        withdrawal(withdrawalSlip);
        deposit(depositSlip);
    }
}
