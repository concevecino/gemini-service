package com.example.gemini.service;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.stereotype.Service;

@Service
public class GeminiService {

    private final ChatModel chatModel;

    public GeminiService(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    public String preguntarAGemini(String prompt) {
        // Envía el texto directamente a Gemini a través de la abstracción de Spring AI
        return chatModel.call(prompt);
    }
}