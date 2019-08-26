package TemplateMethods;

import lombok.extern.log4j.Log4j;

@Log4j
abstract class Specialization extends Generalization{
    // 1. Standardize the skeleton of an algorithm in a "template" method
    protected void stepThr() {
        step3_1();
        step3_2();
        step3_3();
    }
    // 2. Common implementations of individual steps are defined in base class
    private void step3_1() {
        log.info("Specialization.step3_1");
    }
    // 3. Steps requiring peculiar implementations are "placeholders" in the base class
    abstract protected void step3_2();

    private void step3_3() {
        log.info("Specialization.step3_3");
    }
}
