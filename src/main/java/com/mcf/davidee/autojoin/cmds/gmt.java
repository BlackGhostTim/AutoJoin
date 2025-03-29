package com.mcf.davidee.autojoin.cmds;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

import java.util.Collections;
import java.util.List;

public class gmt extends CommandBase {

    @Override
    public String getCommandName() {
        return "gmt";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/gmt";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        //sender.addChatMessage(new ChatComponentText(Minecraft.getMinecraft().getSession().getToken()));
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(Minecraft.getMinecraft().getSession().getToken()));

    }
    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }
    @Override
    public List<String> getCommandAliases() {
        List<String> list = Collections.emptyList();
        list.add("inmt");
        list.add("gimmetoken");
        return list;
    }
}
