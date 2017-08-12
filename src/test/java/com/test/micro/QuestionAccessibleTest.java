package com.test.micro;

import com.test.micro.modal.Questions;
import com.test.micro.service.QuestionAccessible;
import com.test.micro.service.QuestionAccessibleImpl;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class QuestionAccessibleTest {
    @Test
    public void testGetQuestionList() {
        System.out.println("testGetQuestionList");
        long offset = 0L;
        QuestionAccessible instance = new QuestionAccessibleImpl();
        List<Questions> result = instance.getQuestionList(offset);

        assertNotNull("Question list not returned in ::getQuestionList.", result);
        assertEquals(10, result.size());
    }
}
