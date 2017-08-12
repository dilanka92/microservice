package com.test.micro.service;

import com.test.micro.modal.Questions;

import java.util.List;

public interface QuestionAccessible {
    Questions getQuestionByIndex(long index);

    Questions getQuestionById(long id);

    Questions getRandomQuestion();

    List<Questions> getQuestionList(long offset);

    List<Questions> getSpecifiedQuestionList(long... id);

    long getQuestionListSize();
}
