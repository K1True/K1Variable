package org.atk1true.k1variable;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class K1Variable extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        say("the plugin has been installed");
        say("§6你好");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        say("the plugin has been uninstalled");
    }
    public void say(String s){
        CommandSender sender = Bukkit.getConsoleSender();
        sender.sendMessage(s);
    }
}
