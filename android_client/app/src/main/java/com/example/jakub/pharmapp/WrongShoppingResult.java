package com.example.jakub.pharmapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.jakub.pharmapp.drugsItems.drugInCart;
import com.example.jakub.pharmapp.drugsItems.drugInCartAdapter;
import com.example.jakub.pharmapp.drugsItems.drugInDialogAdapter;

import java.util.ArrayList;


public class WrongShoppingResult extends Dialog {

    static String finalprice;
    static boolean recept;
    static ArrayList<drugInCart> listofd;
    private ListView list;
    private TextView resultprice;
    private TextView resultrecipe;
    private Button newOrder;

    public WrongShoppingResult(Context context) {
        super(context);
    }

    public WrongShoppingResult(Context context, int theme) {
        super(context, theme);
    }

    protected WrongShoppingResult(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }


    void showdrugs(){
        drugInDialogAdapter adapterd = new drugInDialogAdapter(getContext(),listofd);
        list.setAdapter(adapterd);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialognotenought);

        setTitle("Braki na magazynie:");

        list = (ListView) findViewById(R.id.dialogListViev) ;


        showdrugs();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }
}
