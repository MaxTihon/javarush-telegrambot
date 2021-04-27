package com.github.javarushcommunity.jrtb.command;

import com.github.javarushcommunity.jrtb.service.SendBotMessageServiceImpl;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Unknown {@link Command}.
 */

public class UnknownCommand implements Command {

    private final SendBotMessageServiceImpl sendBotMessageServiceImpl;

    public static final String UNKNOWN_MESSAGE = "Не понимаю вас \uD83D\uDE1F, напишите /help чтобы узнать что я понимаю.";

    public UnknownCommand(SendBotMessageServiceImpl sendBotMessageServiceImpl) {
        this.sendBotMessageServiceImpl = sendBotMessageServiceImpl;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageServiceImpl.sendMessage(update.getMessage().getChatId().toString(), UNKNOWN_MESSAGE);
    }
}
