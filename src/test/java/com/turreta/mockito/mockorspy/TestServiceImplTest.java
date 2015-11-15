package com.turreta.mockito.mockorspy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestServiceImplTest {

    @Mock
    private Dependency1 dependency1;

    @Spy
    private Dependency2 dependency2;

    private TestServiceImpl service;

    @Before
    public void setUp() throws Exception {

        service = new TestServiceImpl();
        service.setDependency1(dependency1);
        service.setDependency2(dependency2);
    }

    @Test
    public void test_dependencies_mock_or_spy() {

        // dependency1 is a mock object
        Assert.assertTrue(Mockito.mockingDetails(dependency1).isMock());

        // dependency1 is not a spy object
        Assert.assertFalse(Mockito.mockingDetails(dependency1).isSpy());

        // dependency2 is not a mock object
        Assert.assertTrue(Mockito.mockingDetails(dependency2).isMock());

        // dependency2 is a spy object
        Assert.assertTrue(Mockito.mockingDetails(dependency2).isSpy());

    }
}
