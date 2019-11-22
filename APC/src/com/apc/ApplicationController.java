package com.apc;

import java.util.HashMap;

public class ApplicationController {
    private HashMap<String, Handler> commands;

    public ApplicationController() {
        // Create new HashMap to store the handler commands
        commands = new HashMap<String, Handler>();
        commands.put("createRecipe", new CreateRecipeHandler());
        commands.put("displayRecipes", new DisplayRecipesHandler());
        commands.put("displayMenu", new DisplayMenuHandler());
    }

    public Object doCommand(String commandKey, HashMap<String, Object> commandData) throws Exception {
        // For the key passed in from Main.java, find it in the commands HashMap
        Handler command = commands.getOrDefault(commandKey, null);
        // If the commandKey doesn't exist in the list of commands, throw exception
        if (command == null) {
            throw new Exception("There is no command with the key word '" + commandKey + "'.");
        }

        // Pass the found command to the correct handler and pass any appropriate data
        return command.handleIt(commandData);
    }
}
