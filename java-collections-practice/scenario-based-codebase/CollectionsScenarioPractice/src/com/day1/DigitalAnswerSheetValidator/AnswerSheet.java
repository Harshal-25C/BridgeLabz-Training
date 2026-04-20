package com.day1.DigitalAnswerSheetValidator;

import java.util.List;

public abstract class AnswerSheet {
    protected List<String> answers;

    public AnswerSheet(List<String> answers) {
        this.answers = answers;
    }

    public List<String> getAnswers() {
        return answers;
    }
}
