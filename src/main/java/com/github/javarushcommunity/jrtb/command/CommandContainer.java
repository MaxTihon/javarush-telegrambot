package com.github.javarushcommunity.jrtb.command;

import com.github.javarushcommunity.jrtb.service.SendBotMessageService;
import com.github.javarushcommunity.jrtb.service.SendBotMessageServiceImpl;
import com.google.common.collect.ImmutableMap;

import static com.github.javarushcommunity.jrtb.command.CommandName.*;

/**
 * Container of the {@link Command}'s, which are using for handling telegram commands.
 */

public class CommandContainer {
    private final ImmutableMap<String, Command> commandMap;
    private final Command unknownCommand;

    public CommandContainer(SendBotMessageServiceImpl sendBotMessageServiceImpl) {

        this.commandMap = ImmutableMap.<String, Command > builder()
                .put(START.getCommandName(), new StartCommand(sendBotMessageServiceImpl))
                .put(STOP.getCommandName(), new StopCommand(sendBotMessageServiceImpl))
                .put(HELP.getCommandName(), new HelpCommand(sendBotMessageServiceImpl))
                .put(NO.getCommandName(), new NoCommand(sendBotMessageServiceImpl))
                .build();

        this.unknownCommand = new UnknownCommand(sendBotMessageServiceImpl);
    }

    public Command retrieveCommand(String commandIdentifier) {
        return commandMap.getOrDefault(commandIdentifier, unknownCommand);
    }
}
