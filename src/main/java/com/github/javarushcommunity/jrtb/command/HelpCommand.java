package com.github.javarushcommunity.jrtb.command;

import com.github.javarushcommunity.jrtb.service.SendBotMessageServiceImpl;
import org.telegram.telegrambots.meta.api.objects.Update;
import static com.github.javarushcommunity.jrtb.command.CommandName.*;

/**
 * Help {@link Command}.
 */

public class HelpCommand implements Command {

    public static final String HELP_MESSAGE = String.format(
            "✨<b>Дотупные команды</b>✨\n\n"
                    + "<b>Начать\\закончить работу с ботом</b>\n"
                    + "%s - начать работу со мной\n"
                    + "%s - приостановить работу со мной\n\n"
                    + "%s - получить помощь в работе со мной\n",
            START.getCommandName(), STOP.getCommandName(), HELP.getCommandName());

    private final SendBotMessageServiceImpl sendBotMessageServiceImpl;

    public HelpCommand(SendBotMessageServiceImpl sendBotMessageServiceImpl) {
        this.sendBotMessageServiceImpl = sendBotMessageServiceImpl;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageServiceImpl.sendMessage(update.getMessage().getChatId().toString(), HELP_MESSAGE);
    }
}
