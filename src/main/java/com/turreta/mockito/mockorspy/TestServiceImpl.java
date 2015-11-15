package com.turreta.mockito.mockorspy;

public class TestServiceImpl {

    private Dependency1 dependency1;
    private Dependency2 dependency2;

    public Dependency1 getDependency1() {
        return dependency1;
    }

    public void setDependency1(Dependency1 dependency1) {
        this.dependency1 = dependency1;
    }

    public Dependency2 getDependency2() {
        return dependency2;
    }

    public void setDependency2(Dependency2 dependency2) {
        this.dependency2 = dependency2;
    }

}
