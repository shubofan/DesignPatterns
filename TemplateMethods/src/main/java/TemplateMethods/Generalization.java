package TemplateMethods;

import lombok.extern.log4j.Log4j;

@Log4j
abstract class Generalization {

    // 1. Standardize the skeleton of an algorithm in a "Template" method
    void findSolution() {
        stepOne();
        stepTwo();
        stepThr();
        stepFour();
    }

    // 2. Common implementations of individual steps are defined in base class
    private void stepOne() {
        log.info("Generalization.stepOne");
    }

    // 3. Steps requiring peculiar implementations are "placeholders" in the base class
    abstract void stepTwo();

    abstract void stepThr();

    void stepFour() {
        log.info("Generalization.stepFour");
    }
}
