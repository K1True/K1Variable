package org.atk1true.k1variable;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.Arrays;

public class TestUsage extends JavaPlugin {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equals("testUse")){
            Player p = (Player)sender;
            if(!(p instanceof Player)){
                sender.sendMessage("只能在游戏中使用");
                return true;
            }
            Inventory inventory = Bukkit.createInventory(null,54,"测试Container");
            //创建一个物品堆，这个物品堆是指南针
            ItemStack itemStack = new ItemStack(Material.COMPASS);
            //按照个人理解，这是创建一个物品元数据，获取物品堆的数据,再根据此数据进行修改物品堆的对应属性。然后返回给物品堆
            ItemMeta itemMeta = itemStack.getItemMeta();
            //修改物品名称
            itemMeta.setDisplayName("点我传送");
            //设置物品Lore
            itemMeta.setLore(Arrays.asList("a function"));
            itemStack.setItemMeta(itemMeta);
            inventory.addItem(itemStack);
            inventory.setItem(9,itemStack);
            p.openInventory(inventory);
            return true;
        }
        return false;
    }
    /**
     * 但是你会发现我们可以从这个容器里取出指南针，然后再次输入/testUse继续从容器里刷指南针，该怎么办呢？
     * 这个时候需要用到监听事件：Listener  （此处请看org.atk1true.k1variable.InventoryClickListener类)
     * */
}
