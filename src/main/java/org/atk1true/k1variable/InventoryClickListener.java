package org.atk1true.k1variable;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
/**
 * 首先需要实现bukkit插件监听接口Listener
 * */

public class InventoryClickListener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e){
        //先获取被点击的容器
        Inventory inventory = e.getClickedInventory();
        //再判断，被点击的槽位是否是序号9的槽位
        if(e.getRawSlot()==9 && inventory.getTitle().equals("测试Container")){
            //如果是，则获取点击该槽位的玩家
            Player p = (Player)e.getWhoClicked();
            //并使玩家执行指令/spawn
            p.chat("/spawn");
            //取消事件（拒绝玩家拿取指南针）
            e.setCancelled(true);
            //最后关闭该容器
            p.closeInventory();
        }
    }
}
