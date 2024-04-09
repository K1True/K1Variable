package org.atk1true.k1variable;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandCreate implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if(command.equals("kv") && strings[0].equals("add") && strings[1].length()>2 && sender.hasPermission("kv.all")){
            System.out.println("This is a test message");
            sender.sendMessage("This is a test message");
            return true;
        }
        else if(strings.length<2){
            sender.sendMessage("WRONG USAGE!");
            sender.sendMessage("usage:/kv <参数> <变量名> <初始数值>");
            sender.sendMessage("usage:/testUse");
        }
        else if(command.equals("testUse")){
            sender.sendMessage("testUse命令执行成功");
        }
        else if(sender.isOp()){
            sender.sendMessage("usage:/kv <参数> <变量名> <初始数值>");
        }
        return false;
    }
}
