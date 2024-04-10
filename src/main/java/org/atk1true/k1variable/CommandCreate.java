package org.atk1true.k1variable;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandCreate implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if(command.getName().equalsIgnoreCase("kv") && strings[0].equals("add") && strings[1].length()>2 && sender.isOp()){
            System.out.println("This is a test message");
            sender.sendMessage("This is a test message");
            return true;
        }
        else if(strings[0].length()<2 || strings.length < 2){
            sender.sendMessage("WRONG USAGE!");
            sender.sendMessage("usage:/kv <参数> <变量名> <初始数值>");
            sender.sendMessage("usage:/testuse");
            return true;
        }
        else if(command.getName().equals("test")&& sender.hasPermission("k1.test.two")){
            sender.sendMessage("test命令执行成功");
            return true;
        }
        return false;
    }
}
