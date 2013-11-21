package de.dsa_aachen.dsa_elements_personalities;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {
	static String[] fireArray = {"aufbrausend",
		"unstet",
		"rachs�chtig",
		"tobs�chtig",
		"j�hzornig",
		"k�mpferisch",
		"kurzlebig",
		"eifrig",
		"mutig",
		"gehorcht nicht",
		"wahrheitstreu",
		"fordernd",
		"freiheitsliebend",
		"spottend"};
	static String[] lifeArray =  {"lebensspendend",
		"wandelbar",
		"freundlich",
		"jugendlich",
		"gem�tlich",
		"lebendig",
		"kreativ",
		"geduldig",
		"zuversichtlich",
		"gn�dig",
		"lebensfroh"};
	static String[] iceArray =  {"rational",
		"gef�hlskalt",
		"egoistisch",
		"berechnend",
		"perfektionistisch",
		"ordnungsliebend",
		"distanziert",
		"unbarmherzig",
		"lebensverachtend",
		"pr�zise",
		"zeitlos"};
	static String[] airArray =  {"lebensfroh",
		"fl�chtig",
		"unbest�ndig",
		"rastlos",
		"flink",
		"illusionistisch",
		"verspielt",
		"heuchlerisch",
		"tr�gerisch",
		"verwirrend",
		"wankelm�tig",
		"schmeichelnd"};
	static String[] waterArray =  {"unstet",
		"tiefgr�ndig",
		"unergr�ndlich",
		"inspirierend",
		"wandelbar",
		"willensstark",
		"schmeichelnd",
		"anpassungsf�hig",
		"r�cksichtslos",
		"gedankenlos",
		"zornig",
		"melancholisch",
		"vergesslich",
		"wahnsinnig"};
	static String[] stoneArray =  {"willensstark",
		"traditionsbewusst",
		"geduldig",
		"pflichtbewusst",
		"wahrheitsliebend",
		"stur",
		"gelassen",
		"unnachgiebig",
		"unbeweglich",
		"unformbar",
		"tr�ge",
		"zuverl�ssig",
		"schaffensfroh"};

	Random rand = new Random();
	Map<String, String[]> elementsMap = new HashMap<String, String[]>();
	
	//static String[][] elementsArray = {fireArray,lifeArray,iceArray,airArray,waterArray,stoneArray};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		elementsMap.put("Feuer",fireArray);
		elementsMap.put("Humus",lifeArray);
		elementsMap.put("Eis",iceArray);
		elementsMap.put("Luft",airArray);
		elementsMap.put("Wasser",waterArray);
		elementsMap.put("Erz",stoneArray);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		
        final Button createChar = (Button) findViewById(R.id.generatePersonality);
        createChar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	displayNewPersonality();
            }
        });
	}
	void displayNewPersonality(){
		System.out.println("Button wokring!");
		Spinner spinner = (Spinner)findViewById(R.id.spinnerTypeOfElement);
		String spinnerText = spinner.getSelectedItem().toString();
		String[] currentElement = elementsMap.get(spinnerText);
		int randomInt = rand.nextInt(currentElement.length);
		TextView textNewPersonality = (TextView)findViewById(R.id.textNewPersonality);
		textNewPersonality.setText(currentElement[randomInt]);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity, menu);
		return true;
	}

}

