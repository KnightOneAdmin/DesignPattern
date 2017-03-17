package com.knight.desige_pattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.knight.desige_pattern.factorypattern.ConCreateProductA;
import com.knight.desige_pattern.factorypattern.ConcreateFactory;
import com.knight.desige_pattern.factorypattern.Factory;
import com.knight.desige_pattern.factorypattern.Product;
import com.knight.desige_pattern.factorypattern.demo.ConcrateFactory;
import com.knight.desige_pattern.factorypattern.demo.DBHandler;
import com.knight.desige_pattern.factorypattern.demo.FileHandler;
import com.knight.desige_pattern.factorypattern.demo.XMLHandler;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.fileButton)
    Button fileButton;
    @BindView(R.id.xmlButton)
    Button xmlButton;
    @BindView(R.id.dbButton)
    Button dbButton;
    private ConcrateFactory factory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Factory factory = new ConcreateFactory();
        Product product = factory.conCreateProduct(ConCreateProductA.class);
        product.method();
    }

    @OnClick({R.id.fileButton, R.id.xmlButton, R.id.dbButton})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fileButton:
                factory = new ConcrateFactory();
                FileHandler fileHandler = factory.conCreateFactory(FileHandler.class);
                fileButton.setText(fileHandler.query("file"));
                break;
            case R.id.xmlButton:
                factory = new ConcrateFactory();
                XMLHandler xmlHandler = factory.conCreateFactory(XMLHandler.class);
                xmlButton.setText(xmlHandler.query("xml"));
                break;
            case R.id.dbButton:
                factory = new ConcrateFactory();
                DBHandler dbHandler = factory.conCreateFactory(DBHandler.class);
                dbButton.setText(dbHandler.query("db"));
                break;
            default:
                break;
        }
    }
}
