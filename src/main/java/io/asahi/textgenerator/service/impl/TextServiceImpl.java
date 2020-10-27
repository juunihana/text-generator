package io.asahi.textgenerator.service.impl;

import io.asahi.textgenerator.service.TextService;
import org.springframework.stereotype.Service;

@Service
public class TextServiceImpl implements TextService {

    @Override
    public String generateText(String inputText) {
        return inputText;
    }
}
