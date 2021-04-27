package com.github.javarushcommunity.jrtb.command;

import com.github.javarushcommunity.jrtb.service.SendBotMessageServiceImpl;
import org.telegram.telegrambots.meta.api.objects.Update;

/**
 * No {@link Command}.
 */

public class NoCommand implements Command {

    public static final String NO_MESSAGE = "Я поддерживаю команды, начинающиеся со слеша(/).\n"
            + "Чтобы посмотреть список команд введите /help";

    private final SendBotMessageServiceImpl sendBotMessageServiceImpl;

    public NoCommand(SendBotMessageServiceImpl sendBotMessageServiceImpl) {
        this.sendBotMessageServiceImpl = sendBotMessageServiceImpl;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageServiceImpl.sendMessage(update.getMessage().getChatId().toString(), NO_MESSAGE);
    }
}
