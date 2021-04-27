package com.github.javarushcommunity.jrtb.command;

import com.github.javarushcommunity.jrtb.service.SendBotMessageServiceImpl;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Stop {@link Command}.
 */

public class StopCommand implements Command {
    private final SendBotMessageServiceImpl sendBotMessageServiceImpl;

    public static final String STOP_MESSAGE = "Деактивировал все ваши подписки \uD83D\uDE1F.";

    public StopCommand(SendBotMessageServiceImpl sendBotMessageServiceImpl) {
        this.sendBotMessageServiceImpl = sendBotMessageServiceImpl;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageServiceImpl.sendMessage(update.getMessage().getChatId().toString(), STOP_MESSAGE);
    }
}
