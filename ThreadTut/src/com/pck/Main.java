package com.pck;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	static Map<String, Integer> map = new HashMap<>();
	static Map<String, Integer> map2 = new HashMap<>();
	static String countList = "Afghanistan,Albania,Algeria,American Samoa,Andorra,Angola,Anguilla,Antarctica,Antigua and Barbuda,Argentina,Armenia,Aruba,Australia,Austria,Azerbaijan,Bahamas,Bahrain,Bangladesh,Barbados,Belarus,Belgium,Belize,Benin,Bermuda,Bhutan,Bolivia,Bosnia and Herzegovina,Botswana,Bouvet Island,Brazil,British Indian Ocean Territory,Brunei Darussalam,Bulgaria,Burkina Faso,Burundi,Cambodia,Cameroon,Canada,Cape Verde,Cayman Islands,Central African Republic,Chad,Chile,China,Christmas Island,Cocos (Keeling Islands),Colombia,Comoros,Congo,Cook Islands,Costa Rica,Cote D'Ivoire (Ivory Coast),Croatia (Hrvatska,Cuba,Cyprus,Czech Republic,Denmark,Djibouti,Dominica,Dominican Republic,East Timor,Ecuador,Egypt,El Salvador,Equatorial Guinea,Eritrea,Estonia,Ethiopia,Falkland Islands (Malvinas),Faroe Islands,Fiji,Finland,France,France, Metropolitan,French Guiana,French Polynesia,French Southern Territories,Gabon,Gambia,Georgia,Germany,Ghana,Gibraltar,Greece,Greenland,Grenada,Guadeloupe,Guam,Guatemala,Guinea,Guinea-Bissau,Guyana,Haiti,Heard and McDonald Islands,Honduras,Hong Kong,Hungary,Iceland,India,Indonesia,Iran,Iraq,Ireland,Israel,Italy,Jamaica,Japan,Jordan,Kazakhstan,Kenya,Kiribati,Korea (North),Korea (South),Kuwait,Kyrgyzstan,Laos,Latvia,Lebanon,Lesotho,Liberia,Libya,Liechtenstein,Lithuania,Luxembourg,Macau,Macedonia,Madagascar,Malawi,Malaysia,Maldives,Mali,Malta,Marshall Islands,Martinique,Mauritania,Mauritius,Mayotte,Mexico,Micronesia,Moldova,Monaco,Mongolia,Montserrat,Morocco,Mozambique,Myanmar,Namibia,Nauru,Nepal,Netherlands,Netherlands Antilles,New Caledonia,New Zealand,Nicaragua,Niger,Nigeria,Niue,Norfolk Island,Northern Mariana Islands,Norway,Oman,Pakistan,Palau,Panama,Papua New Guinea,Paraguay,Peru,Philippines,Pitcairn,Poland,Portugal,Puerto Rico,Qatar,Reunion,Romania,Russian Federation,Rwanda,Saint Kitts and Nevis,Saint Lucia,Saint Vincent and The Grenadines,Samoa,San Marino,Sao Tome and Principe,Saudi Arabia,Senegal,Seychelles,Sierra Leone,Singapore,Slovak Republic,Slovenia,Solomon Islands,Somalia,South Africa,S. Georgia and S. Sandwich Isls.,Spain,Sri Lanka,St. Helena,St. Pierre and Miquelon,Sudan,Suriname,Svalbard and Jan Mayen Islands,Swaziland,Sweden,Switzerland,Syria,Taiwan,Tajikistan,Tanzania,Thailand,Togo,Tokelau,Tonga,Trinidad and Tobago,Tunisia,Turkey,Turkmenistan,Turks and Caicos Islands,Tuvalu,Uganda,Ukraine,United Arab Emirates,United Kingdom,United States,US Minor Outlying Islands,Uruguay,Uzbekistan,Vanuatu,Vatican City State (Holy See),Venezuela,Viet Nam,Virgin Islands (British),Virgin Islands (US),Wallis and Futuna Islands,Western Sahara,Yemen,Yugoslavia,Zaire,Zambia,Zimbabwe";

	static Map preparemap() {

		map.put("/.@", 1);
		map.put("ABC", 2);
		map.put("DEF", 3);
		map.put("GHI", 4);
		map.put("JKL", 5);
		map.put("MNO", 6);
		map.put("PQRS", 7);
		map.put("TUV", 8);
		map.put("WXYZ", 9);

		return map;
	}

	static Integer preparemap2(String key) {

		map2.put("A", 1);
		map2.put("B", 2);
		map2.put("C", 3);
		map2.put("D", 4);
		map2.put("E", 5);
		map2.put("F", 6);
		map2.put("G", 7);
		map2.put("H", 8);
		map2.put("I", 9);
		map2.put("J", 10);
		map2.put("K", 11);
		map2.put("L", 12);
		map2.put("M", 13);
		map2.put("N", 14);
		map2.put("O", 15);
		map2.put("P", 16);
		map2.put("Q", 17);
		map2.put("R", 18);
		map2.put("S", 19);
		map2.put("T", 20);
		map2.put("U", 21);
		map2.put("V", 22);
		map2.put("W", 23);
		map2.put("X", 24);
		map2.put("Y", 25);
		map2.put("Z", 26);

		return map2.get(key);
	}

	public static String getCountry(String s) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("f3.txt")));
		Map<String, String> map = new HashMap<>();
		String ss = "";
		while ((ss = br.readLine()) != null) {
			map.put(ss.toCharArray()[ss.toCharArray().length - ss.toCharArray().length] + "", ss);
		}

		// Set<Map.Entry<String, String>> entry = map.entrySet();

		return map.get(s);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
