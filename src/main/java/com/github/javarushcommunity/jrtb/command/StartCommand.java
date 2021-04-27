package com.github.javarushcommunity.jrtb.command;

import com.github.javarushcommunity.jrtb.service.SendBotMessageServiceImpl;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * Start {@link Command}.
 */

public class StartCommand implements Command {

    private final SendBotMessageServiceImpl sendBotMessageServiceImpl;

    public static final String START_MESSAGE = "Привет. Я Javarush Telegram Bot. Я помогу тебе быть в курсе последних " +
            "статей тех авторов, котрые тебе интересны. Я еще маленький и только учусь.";

    public StartCommand(SendBotMessageServiceImpl sendBotMessageServiceImpl) {
        this.sendBotMessageServiceImpl = sendBotMessageServiceImpl;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageServiceImpl.sendMessage(update.getMessage().getChatId().toString(), START_MESSAGE);
    }
}
