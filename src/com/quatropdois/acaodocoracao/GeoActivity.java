package com.quatropdois.acaodocoracao;

import android.app.Activity;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GeoActivity extends Activity {
	
	private final LatLng LOCATION_MUSEU = new LatLng(-23.9329211, -46.3300489);
	
	private final LatLng LOCATION_SANTO = new LatLng(-23.931461,-46.333595);
	
	private final LatLng LOCATION_EDUCACAO = new LatLng(-23.9326214,-46.3302372);
	
	private final LatLng LOCATION_CAMPS = new LatLng(-23.9470198,-46.325567);
	
	private final LatLng LOCATION_TRIBUNA = new LatLng(-23.935126,-46.3275421);
	
	private final LatLng LOCATION_PREFEIT = new LatLng(-23.933775,-46.329125);
	
	private final LatLng LOCATION_COPMAU = new LatLng(-23.9334134,-46.329508);
	
	private final LatLng LOCATION_GRAOPIM = new LatLng(-23.936239,-46.3296997);
	
	private final LatLng LOCATION_COLBARNABE = new LatLng(-23.93779,-46.3281594);
	
	private final LatLng LOCATION_BALNEARIO = new LatLng(-23.9698961,-46.3316962);
	
	private final LatLng LOCATION_AOPH = new LatLng(-23.9675126,-46.3312739);
	
	private final LatLng LOCATION_FOFOLET = new LatLng(-23.9505498,-46.3367945);
	
	private final LatLng LOCATION_RENTAL = new LatLng(-23.957516,-46.3275881);
	
	private final LatLng LOCATION_ESTCID = new LatLng(-23.958465,-46.3323754);
	
	private final LatLng LOCATION_JORORL = new LatLng(-23.9670462,-46.3309214);
	
	private final LatLng LOCATION_MEDCENT = new LatLng(-23.9532547,-46.3296319);
	
	private final LatLng LOCATION_ROSELI = new LatLng(-23.9625304,-46.3455043);
	
	private final LatLng LOCATION_PORTAL = new LatLng(-23.9445183,-46.3350498);
	
	private final LatLng LOCATION_HOSPSNT = new LatLng(-23.9447297,-46.3355243);
	
	private final LatLng LOCATION_HOSBENE = new LatLng(-23.9501497,-46.3370156);
	
	private final LatLng LOCATION_ILHABEL = new LatLng(-23.9660847,-46.3391139);
	
	private final LatLng LOCATION_FLORIKE = new LatLng(-23.965424,-46.339996);
	
//	private final LatLng LOCATION_AMBTORI = new LatLng(49.27645, -122.917587);
	
	private final LatLng LOCATION_TVTRIBU = new LatLng(-23.9541087,-46.3754317);
	
	private final LatLng LOCATION_PINACOT = new LatLng(-23.973391,-46.322377);
	
	private final LatLng LOCATION_SESCSAN = new LatLng(-23.947302,-46.321809);
	
	private final LatLng LOCATION_ROCA = new LatLng(-23.9774834,-46.3117417);
	
	private final LatLng LOCATION_BOQNEWS = new LatLng(-23.9635613,-46.3183284);
	
	private final LatLng LOCATION_CLARISHAIR = new LatLng(-23.9657768,-46.3160983);
	
	private final LatLng LOCATION_HOSPGUIL = new LatLng(-23.9624002,-46.3215602);
	
	private final LatLng LOCATION_ADESAF = new LatLng(-23.9590925,-46.3979181);
	
	private final LatLng LOCATION_APAE = new LatLng(-23.9618188,-46.3826862);
	
	private final LatLng LOCATION_COLALFA = new LatLng(-23.9932763,-46.2563835);
	
	private final LatLng LOCATION_SESICUB = new LatLng(-23.9225264,-46.4151948);
	
//	private final LatLng LOCATION_SANTOS = new LatLng(-23.9593311, -46.3319782);
	
//	private GoogleMap map;
	
	private GoogleMap googleMap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
        
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_geo);
		
//		googleMap.setMyLocationEnabled(true);
		
		googleMap  = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		
		googleMap.addMarker(new MarkerOptions().position(LOCATION_MUSEU).title("Museu do Café").snippet("Rua XV de Novembro, 95 – Centro – Santos").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_SANTO).title("Santuário Santo Antônio do Valongo").snippet("Largo Marquês de Monte Alegre, s/n – Centro - Santos").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_EDUCACAO).title("Secretaria de Educação").snippet("Rua Frei Gaspar, 25 – em frente a Bolsa do Café").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_CAMPS).title("CAMPS").snippet("Av. Washington Luis,2 – Vila Matias").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_TRIBUNA).title("Jornal A Tribuna").snippet("Rua João Pessoa, 129 – Centro – Santos").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_PREFEIT).title("Prefeitura Municipal de Santos").snippet("Praça Mauá, s/n – Centro - Santos").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_COPMAU).title("Copiadora Mauá").snippet("Praça Mauá,28 Centro Santos").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_GRAOPIM).title("Grão Pimenta ").snippet("Rua Riachuelo, 43 – Centro").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_COLBARNABE).title("Colégio Barnabé").snippet("Av. São Francisco, Centro – perto da Sabesp").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_BALNEARIO).title("Shopping Parque Balneário").snippet("Av. Ana Costa, 549 – Gonzaga").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_AOPH).title("Ao Pharmacêutico").snippet("Rua Galeão Carvalhal, 38 – Gonzaga – Santos").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_FOFOLET).title("Clínica Fofolete").snippet("Av. Bernardino de Campos, 75 ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_RENTAL).title("Rental Festa").snippet("Av. Washington Luiz, 102").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_ESTCID).title("Estação da Cidadania").snippet("Av. Ana Costa, em frente ao supermercado Extra ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_JORORL).title("Jornal da Orla").snippet("Rua Timbiras, 16 – Gonzaga").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_MEDCENT).title("Medcenter").snippet("R. Dr. Olinto Rodrigues Dantas, 343 - Encruzilhada, Santos/SP").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_ROSELI).title("Roseli Hanna").snippet("Av. Senador Pinheiro Machado, 930/apt.13").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_PORTAL).title("Posto Portal").snippet("Av. Dr. Cláudio Luiz da Costa, 291 – Jabaquara-  Santos").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_HOSPSNT).title("Hospital Santa Casa de Misericórdia de Santos").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_HOSBENE).title("Hospital Beneficência Portuguesa").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_ILHABEL).title("Edifício Ilha Bela").snippet("Av. Bernardino de Campso, 626 – Pompeia").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_FLORIKE).title("Floricultura Ikebana").snippet("Rua Euclides da Cunha").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_TVTRIBU).title("TV Tribuna").snippet("Av. Antonio Emmerick, 1373 – Jardim Três Estrelas – S. Vicente").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_PINACOT).title("Pinacoteca Benedito Calixto").snippet("Av. Bartolomeu de Gusmão, 15 Boqueirão").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_SESCSAN).title("SESC Santos").snippet("R. Conselheiro Ribas, 136 - Aparecida").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_ROCA).title("Roca").snippet("Rua Alexandre Martins 47/49 – Aparecida").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_BOQNEWS).title("BoqNews").snippet("Av. Pedro Lessa, 3076, cj 81 – Embaré").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_CLARISHAIR).title("Claris Hair").snippet("Rua São José, 38 - Embaré").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_HOSPGUIL).title("Hospital Guilherme Álvaro").snippet("Rua Dr. Oswaldo Cruz, 197 – Boqueirão").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_ADESAF).title("ADESAF").snippet("R. Guarany, 70, São Vicente - SP, 11360-000").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_APAE).title("APAE").snippet("Rua Feliciana Marcondes da Silva, 205 – Catiapoã").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_COLALFA).title("Colégio Alfa").snippet("Rua Washington, 293/305 – Vila Maia – Guarujá").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

		googleMap.addMarker(new MarkerOptions().position(LOCATION_SESICUB).title("SESI").snippet("Av. Comendador Francisco Bernardo, 261 – Parque São Luiz – Cubatão").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
		
//		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_SANTOS, 14);
		
//		map.animateCamera(update);
		
		AdView adView = (AdView)this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
		
		setUpMap();
	}
	
	
	private void setUpMap(){
		
		googleMap.setMyLocationEnabled(true);
		
		LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
		
		Criteria criteria = new Criteria();
		
		String provider = locationManager.getBestProvider(criteria, true);
		
		Location myLocation = locationManager.getLastKnownLocation(provider);
		
		googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		
		double latitude = myLocation.getLatitude();
		
		double longitude = myLocation.getLongitude();
		
		LatLng latLng = new LatLng(latitude, longitude);
		
		googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
		
		googleMap.animateCamera(CameraUpdateFactory.zoomTo(15));
		
//		googleMap.addMarker(new MarkerOptions().position(new LatLng(latitude, longitude)).title("Tu ta aqui!"));
		
	}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}
//	
//	public void onClick_City(View v) {
////		CameraUpdate update = CameraUpdateFactory.newLatLng(LOCATION_BURNABY);
//		map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
//		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_BURNABY, 9);
//		map.animateCamera(update);
//	}
//	public void onClick_Burnaby(View v) {
//		map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
//		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_BURNABY, 14);
//		map.animateCamera(update);
//		
//	}
//	public void onClick_Surrey(View v) {
//		map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
//		CameraUpdate update = CameraUpdateFactory.newLatLngZoom(LOCATION_SURRREY, 16);
//		map.animateCamera(update);
//		
//	}

}
