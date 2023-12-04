package com.example.aliva.aliva.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.aliva.R;
import com.example.aliva.aliva.adapters.DataBaseAdapter;
import com.example.aliva.aliva.adapters.HomeDiscountsRecyclerViewAdapter;
import com.example.aliva.aliva.adapters.HomeRecyclerViewAdapter;
import com.example.aliva.aliva.pojos.HotelModel;

import java.util.List;

public class home_fragment extends Fragment {

    // HomeSummer RecyclerView and Adapter.
    RecyclerView HomeSummerHotelsRV;
    HomeRecyclerViewAdapter HomeSummerHotelsAdapter;

    // HomeDiscounts RecyclerView and Adapter.
    RecyclerView HomeDiscountsRV;
    HomeDiscountsRecyclerViewAdapter homeDiscountsAdapter;

    DataBaseAdapter dataBaseAdapter;

    EditText searchBar;

    public home_fragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.home_fragment, container, false);

        Context context = getContext();

        searchBar = view.findViewById(R.id.searchBar);
        searchBar.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), SearchActivity.class);
            startActivity(intent);
        });

        dataBaseAdapter = new DataBaseAdapter(context);
//        addingHotelsToDataBase();

        List<HotelModel> preMadeHotels = dataBaseAdapter.getAllData();

        HomeSummerHotelsRV = view.findViewById(R.id.summerHotelRV);
        HomeSummerHotelsAdapter = new HomeRecyclerViewAdapter(context, preMadeHotels);
        HomeSummerHotelsRV.setAdapter(HomeSummerHotelsAdapter);

        HomeDiscountsRV = view.findViewById(R.id.HomeDiscountsRV);
        homeDiscountsAdapter = new HomeDiscountsRecyclerViewAdapter(context, preMadeHotels);
        HomeDiscountsRV.setAdapter(homeDiscountsAdapter);

        return view;

    }

    private void addingHotelsToDataBase() {
        dataBaseAdapter.insertRow(new HotelModel(R.drawable.novotel, "Novotel Cairo Airpoty", "Cairo Airport Road, Heliopolis, 11776 Cairo, Egypt", "Novotel Cairo Airport offers 2 outdoor pools in the landscaped garden, free Wi-Fi and free airport shuttle. It is a 10-minute drive from the International Convention and Exhibition Centre.\n" +
                "\n" +
                "This 4-star hotel provides air-conditioned guest rooms with satellite TV and a tea/coffee maker.  Each has a private bathroom with a hairdryer.\n" +
                "\n" +
                "Guests can enjoy a workout at the on-site fitness centre or a game of tennis on the court nearby. Novotel Cairo Airport also offers a business centre, a 24-hour front desk and car rental.\n" +
                "\n" +
                "The Novotel Cairo’s 5 restaurants serve international and Mediterranean cuisine and 2 bars. Guests can enjoy live music with cold drinks at Le Rendez-vous.\n" +
                "\n" +
                "Novotel Cairo Airport is a 20-minute drive from the centre of Cairo. A free airport shuttle is available and can be arranged by the hotel.\n" +
                "\n" +
                "Couples particularly like the location — they rated it 8.2 for a two-person trip.", "7.4", "5,244"));
        dataBaseAdapter.insertRow(new HotelModel(R.drawable.lepassage, "Le Passage Cairo Hotel", "Cairo International Airport Road, Heliopolis, 99999 Cairo, Egypt", "Le Passage Cairo is only 2-minutes from the Cairo International Airport in Cairo’s Heliopolis district. The hotel offers fine restaurants, a discotheque and a casino. Free airport transfer is available.\n" +
                "\n" +
                "The rooms at Le Passage Cairo Hotel & Casino are equipped with individually controlled air conditioning and satellite TVs. Rooms also includes in-room safe deposit boxes, minibars and a hairdryers. 24-hour room service is available.\n" +
                "\n" +
                "Guests can enjoy a swim in one of the 2 pools. Guests have access to volleyball courts, and a jogging track. There is a fully-equipped gym and of range of massage and body treatments at the spa.\n" +
                "\n" +
                "A popular breakfast is served at the 24-hour Orangerie Restaurant. Fine meals are also served at the Le Passage’s onsite Chinese, Italian, Egyptian and international restaurants. Guests can enjoy snacks and cocktails poolside at the Pool Restaurant.\n" +
                "\n" +
                "Cairo’s city centre is 10 km from Le Passage Hotel. Parking is available on site.\n" +
                "\n" +
                "Couples particularly like the location — they rated it 8.5 for a two-person trip.", "8.9", "6,251"));
        dataBaseAdapter.insertRow(new HotelModel(R.drawable.sofitel, "Sofitel Cairo Nile El Gezirah", "3 El Thawra Council St Zamalek, 11518 Cairo, Egypt", "Sofitel El Gezirah is a 5-star luxury hotel with a private promenade along the Nile. It is within a walking distance to the Opera House and Cairo Tower, as well as the Egyptian Museum and Khan El Khalili. It features an infinity outdoor pool. Free WiFi is available in all areas. Private on site car parking is available.\n" +
                "\n" +
                "All guest rooms at the Sofitel El Gezirah hotel feature air conditioning, satellite TV, free WiFi and a minibar. Many rooms provide far-reaching views along the River Nile and across the city of Cairo.\n" +
                "\n" +
                "The hotel has 4 restaurants, which include Moroccan, Egyptian, & Italian specialties. There are also 2 bars including Sunny Bar and Window on the Nile.\n" +
                "\n" +
                "Sofitel Cairo Nile El Gezirah has a range of leisure facilities, including a spa complete with a swimming pool, a hammam, and fitness center. A hot tub is available with massage packages. Tours and trips can be arranged at the concierge desk.\n" +
                "\n" +
                "Sofitel Cairo Nile El Gezirah is 20 km from Cairo international airport.\n" +
                "\n" +
                "Couples particularly like the location — they rated it 9.1 for a two-person trip.", "9.2", "7,580"));
        dataBaseAdapter.insertRow(new HotelModel(R.drawable.almasa, "Al Masa Hotel Nasr City", "Abdel Aziz El Shennawy Street, Nasr City, Cairo, Egypt","Al Masa Hotel Nasr City features a terrace with a swimming pool. Located in the green area of Nasr City, it offers 5 restaurants and a wellness center. All the elegant rooms have a balcony.\n" +
                "\n" +
                "All the rooms and suites at Al Masa Hotel Nasr City have views of the terrace, the garden or the pool. Each air-conditioned unit includes a flat-screen TV and a minibar.\n" +
                "\n" +
                "Guests can enjoy the continental breakfast served every morning, when booked. There is also a wide variety of menus in the different restaurants and bars of the hotel, including gourmet cuisine and fish specialties.\n" +
                "\n" +
                "Al Masa Hotel Nasr City has a selection of activities, including different types of massages. Billiards and bowling are part of the offer. A library is also available at the hotel.\n" +
                "\n" +
                "Cairo International Airport is a 10-minute drive and Cairo International Conference Centre is just 5 minutes’ drive. Cairo city center and the Egyptian Museum are both 20 minutes away by car.\n" +
                "\n" +
                "Couples particularly like the location — they rated it 8.4 for a two-person trip.", "7.2", "4,530"));
        dataBaseAdapter.insertRow(new HotelModel(R.drawable.marriot, "Marriott Mena House", "Pyramids' Road, Giza, Cairo, Egypt", "Overlooking the Great Pyramids of Giza, Marriott Mena House, Cairo is surrounded by 40 acres of green gardens and has a spa, fitness centre and a pool. The rooms are decorated with handcrafted furniture.\n" +
                "\n" +
                "All accommodations at Marriott Mena House, Cairo have air conditioning and include luxurious fabrics, a seating area and LCD TV. Each room and suite has a spacious private bathroom with a bathrobe and slippers.\n" +
                "\n" +
                "Breakfast is available in the dining room facing the garden.\n" +
                "\n" +
                "Dining choices range from Italian specialties at Alfredo Restaurant, while Daily Buffet Breakfast and unforgettable vistas with its cocktails served at 139 Pavilion.\n" +
                "\n" +
                "Recreational Facilities include a winter heated swimming pool tucked away in the landscape gardens.\n" +
                "\n" +
                "The Giza Pyramids are less than half a kilometer from the Marriott Mena House. The concierge can arrange horse and camel rides to the pyramids. Cairo Airport is 30.6 km away.\n" +
                "\n" +
                "Couples particularly like the location — they rated it 9.5 for a two-person trip.", "8.5", "6,543"));
        dataBaseAdapter.insertRow(new HotelModel(R.drawable.concorde, "Concorde El Salam Cairo", "65 Abdel Hamid Badawi St., Heliopolis, Cairo, Egypt", "Just a 25-minute drive from City Centre, Concorde El Salam Hotel Cairo is 6 km from fashionable Heliopolis suburb. It features 8 restaurants, 2 outdoor pools, and private stables. The rooms include flat-screen TVs and free Wi-Fi.\n" +
                "\n" +
                "All rooms at Concorde El Salam come with floor-to-ceiling windows opening to a private balcony with garden or pool views. Each room has an en suite bathroom.\n" +
                "\n" +
                "Hotel Concorde El Salam has 8 restaurants, ranging from Italian Restaurant to Abou Aouf Restaurant serving Egyptian and Lebanese dishes.  Live open-air performances can be enjoyed at La Veranda restaurant.\n" +
                "\n" +
                "The hotel’s Zing Health Club & Spa offers a wide range of relaxation treatments and an extensive gym. There are also squash court and an equestrian centre, offering riding lessons.\n" +
                "\n" +
                "Cairo International Airport and Cairo International Convention & Exhibition Centre are a 10-minute drive away from Concorde El Salam Hotel Cairo. Airport shuttle can be provided by the hotel.\n" +
                "\n" +
                "Couples particularly like the location — they rated it 8.0 for a two-person trip.", "7.8", "3,200"));
        dataBaseAdapter.insertRow(new HotelModel(R.drawable.sonseta, "Sonesta Hotel Tower", "3 Tayaran St., Nasr City, Nasr City, Cairo, Egypt", "Located in Nasr City residential area and a 10-minute drive from the airport, Sonesta Hotel boasts 5 restaurants and 2 bars. It features an outdoor swimming pool and sun terrace.\n" +
                "\n" +
                "All air-conditioned rooms at the Sonesta Hotel Tower & Casino Cairo are spacious and elegantly decorated. Room are equipped with a satellite TV and minibar. All rooms enjoy free WiFi.\n" +
                "\n" +
                "The poolside bar and full-service spa with hammam are havens for relaxation. After the pampering, guests are offered a varied choice of dining options at the hotel’s gourmet restaurants.\n" +
                "\n" +
                "The hotel's welcome service picks up guests from Cairo Airport through the luxury fast track service ( for a fee )  .All the details should be submitted to the hotel 48 hours prior to arrival date.\n" +
                "\n" +
                "The Cairo Conference Centre is less than 2 km away. The citadel is a 15-minute drive and the pyramids are 20 km from the Sonesta Hotel Tower Cairo.", "6.7", "3,400"));
        dataBaseAdapter.insertRow(new HotelModel(R.drawable.pyramisa, "Pyramisa Suites Hotel", "60 Giza Street, Dokki, Dokki, 99999 Cairo, Egypt", "Located in the Dokki district of central Cairo, Pyramisa Suites Hotel offers rooms with Nile River or city views. It has a full service spa and 2 outdoor pools.\n" +
                "\n" +
                "Each spacious room at the Pyramisa Suites is fitted with air conditioning, TV, coffee & tea facilities and a minibar. The en suite bathroom comes with amenities and a hairdryer.\n" +
                "\n" +
                "The hotel’s wellness centre offers a range of treatments including massage and hydrotherapy baths. There is also a hammam and sauna. It also offers a beauty centre and a hot tub.\n" +
                "\n" +
                "The Pyramisa Suites Hotel offers a choice of 4 restaurants, serving food ranging from classic Egyptian and Italian cuisine to Indian and Chinese specialty dishes. Also featured is an international buffet restaurant.\n" +
                "\n" +
                "Dokki Metro Station, just 500 metres from the Pyramisa, connects with 2 stops to Tahrir Square. The Egyptian Museum is a 5-minute drive from the hotel and the Giza Pyramids are 30 minutes by car away.", "6.4", "2,350"));

    }

}