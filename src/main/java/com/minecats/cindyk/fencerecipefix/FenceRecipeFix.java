package com.minecats.cindyk.fencerecipefix;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.TreeSpecies;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cindy on 8/9/2014.
 */
public class FenceRecipeFix extends JavaPlugin{


        @Override
        public void onEnable()
        {

            getLogger().info("Thank you ThinkOfDeath!");
            getLogger().info("Visit him at: www.Spigotmc.org");


            //==================================================================
            //Add the two recipes
            getServer().addRecipe( CreateRecipe1());

            getServer().addRecipe( CreateRecipe2());

        }

    ShapedRecipe CreateRecipe1(   )
    {
        ShapedRecipe r;
        ItemStack fence2 = new ItemStack( Material.FENCE,3 );
        ItemMeta im2 = fence2.getItemMeta();
        im2.setDisplayName( "Spigot Fences" );
        fence2.setItemMeta( im2 );

        r = new ShapedRecipe( fence2 );
        r.shape("   ", "ASB", "CSD" );

        r.setIngredient( 'S', Material.STICK );
        ItemStack tree = new ItemStack(Material.WOOD,-1);
        ItemStack tree2 = new ItemStack(Material.WOOD,-1);
        ItemStack tree3 = new ItemStack(Material.WOOD,-1);
        ItemStack tree4 = new ItemStack(Material.WOOD,-1);
        r.setIngredient( 'A',tree.getData());
        r.setIngredient( 'B',tree2.getData());
        r.setIngredient( 'C',tree3.getData());
        r.setIngredient( 'D',tree4.getData());

        return r;

    }

    ShapedRecipe CreateRecipe2( )
    {
        ItemStack fence2 = new ItemStack( Material.FENCE,3 );
        ItemMeta im2 = fence2.getItemMeta();
        im2.setDisplayName( "Spigot Fences" );
        fence2.setItemMeta( im2 );

        ShapedRecipe recipe2 = new ShapedRecipe( fence2 );
        recipe2.shape( "PSP", "PSP", "   " );

        recipe2.setIngredient( 'S', Material.STICK );

        ItemStack tree = new ItemStack(Material.WOOD,-1);
        recipe2.setIngredient( 'P', tree.getData());

        return recipe2;

    }


}
