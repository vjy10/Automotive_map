package datas.models

var Place= listOf(
    place(1,
        "Bangalore",
        "Bangalore, officially known as Bengaluru, is the capital city of the Indian state of Karnataka. It is renowned as the \"Silicon Valley of India\" due to its thriving IT industry and is also recognized for its pleasant climate and vibrant culture.",
        12.9716,
        77.5946),
    place(2,
        "Kerala",
        "Kerala, a state on India's tropical Malabar Coast, has nearly 600km of Arabian Sea shoreline. It's known for its palm-lined beaches and backwaters, a network of canals. Inland are the Western Ghats, mountains whose slopes support tea, coffee and spice plantations as well as wildlife.",
        10.5387248,
        73.4957182),
    place(3,
        "OOty",
        " Ooty (short for Udhagamandalam) is a resort town in the Western Ghats mountains, in southern India's Tamil Nadu state. Founded as a British Raj summer resort, it retains a working steam railway line.",
        11.4119339,
        76.6522216),

    place(4,
        "munnar",
        "Munnar is a town in the Western Ghats mountain range in India’s Kerala state. A hill station and former resort for the British Raj elite, it's surrounded by rolling hills dotted with tea plantations established in the late 19th century.",
        10.0806912,
        77.0435782),
    place(5,
        "Vagamon",
        "Vagamon is an Indian hill station and a revenue village primarily located in Peerumedu Taluk of Idukki district, and also Meenachil taluk and Kanjirappally taluk of Kottayam district in the state of Kerala, India ",
        9.6729687,
        76.862303),
    place(6,
        "Kumbalangi",
        "Kumbalangi is a quiet, leafy island village known for rural tourism activities. People visit the island to see Chinese fishing nets, explore its mangrove forests, and experience traditional Keralan village life. Boat trips from Kallenchery cruise along the surrounding backwaters.",
        9.8759228,
        76.2656035),
    place(7,
        "Kuzhuppilly Beach",
        "Kuzhupilly beach, located in Vypeen or Vypin, this white, sandy beach is ideal for swimming. The backwaters nearby are an added charm, as are the paddy fields and coconut groves on the way to the beach, where kite festivals are occasionally held.",
        10.1053137,
        76.1777347)

)
class PlaceRepository(){
    fun getPlaces(): List<place> {
        return Place
    }
    fun getPlace(placeId: Int): place? {
        return Place.find { it.id== placeId }
    }
}