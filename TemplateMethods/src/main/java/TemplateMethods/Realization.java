package TemplateMethods;

import lombok.extern.log4j.Log4j;

@Log4j
public class Realization extends Specialization{
    // 4. Derived classes can override placeholder methods
    protected void stepTwo() {
        log.info("Realization.stepTwo");
    }

    protected void step3_2() {
        log.info( "Realization.step3_2");
    }

    // 5. Derived classes can override implemented methods
    // 6. Derived classes can override and "call back to" base class methods
    protected void stepFor() {
        log.info("Realization.stepFor");
        super.stepFour();
    }
}
