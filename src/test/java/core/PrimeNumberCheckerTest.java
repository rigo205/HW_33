package core;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class PrimeNumberCheckerTest {
	private PrimeNumberChecker pn;
@Before
	public void initialize() {
		pn = new PrimeNumberChecker();	
	                         }
	@Parameter(value = 0)
	public Integer inputNumber;

	@Parameter(value = 1)
	public Boolean expectedResult;

	@Parameters(name = "Iteration # {index}: Number: {0}; isPrime? {1}")

	public static Collection<Object[]> primeNumbers() {
		Object[][] data = new Object[][] {
			{2, true},
			{3, true},
			{4, true},
			{5, true},
			{6, false},
			{7, true},
			{8, false},
			{9, false},
			{10, false},
			{11, true},
			{12, false},
			{13, true},
			{14, false},
			{15, false},
			{16, false},
			{17, true},
			{18, false},
			{19, true},
			{20, false},
			{21, false},
			{22, false},
			{23, true},
			{24, false},
			{25, false},
			{26, false},
			{27, false},
			{28, false},
			{29, true},
			{30, false},
			{31, true},
			{32, false},
			{33, false},
			{34, false},
			{35, false},
			{36, false},
			{37, true},
			{38, false},
			{39, false},
			{40, false},
			{41, true},
			{42, false},
			{43, true},
			{44, false},
			{45, false},
			{46, false},
			{47, true},
			{48, false},
			{49, false},
			{50, false},
			{51, false},
			{52, false},
			{53, true},
			{54, false},
			{55, false},
			{56, false},
			{57, false},
			{58, false},
			{59, true},
			{60, false},
			{61, true},
			{62, false},
			{63, false},
			{64, false},
			{65, false},
			{66, false},
			{67, true},
			{68, false},
			{69, false},
			{70, false},
			{71, true},
			{72, false},
			{73, true},
			{74, false},
			{75, false},
			{76, false},
			{77, false},
			{78, false},
			{79, true},
			{80, false},
			{81, false},
			{82, false},
			{83, true},
			{84, false},
			{85, false},
			{86, false},
			{87, false},
			{88, false},
			{89, true},
			{90, false},
			{91, false},
			{92, false},
			{93, false},
			{94, false},
			{95, false},
			{96, false},
			{97, true},
			{98, false},
			{99, false},
			{100, false},
			{101, true},
			{102, false},
			{103, true},
			{104, false},
			{105, false},
			{106, false},
			{107, true},
			{108, false},
			{109, true},
			{110, false},
			{111, false},
			{112, false},
			{113, true},
			{114, false},
			{115, false},
			{116, false},
			{117, false},
			{118, false},
			{119, false},
			{120, false},
			{121, false},
			{122, false},
			{123, false},
			{124, false},
			{125, false},
			{126, false},
			{127, true},
			{128, false},
			{129, false},
			{130, false},
			{131, true},
			{132, false},
			{133, false},
			{134, false},
			{135, false},
			{136, false},
			{137, true},
			{138, false},
			{139, true},
			{140, false},
			{141, false},
			{142, false},
			{143, false},
			{144, false},
			{145, false},
			{146, false},
			{147, false},
			{148, false},
			{149, true},
			{150, false},
			{151, true},
			{152, false},
			{153, false},
			{154, false},
			{155, false},
			{156, false},
			{157, true},
			{158, false},
			{159, false},
			{160, false},
			{161, false},
			{162, false},
			{163, true},
			{164, false},
			{165, false},
			{166, false},
			{167, true},
			{168, false},
			{169, false},
			{170, false},
			{171, false},
			{172, false},
			{173, true},
			{174, false},
			{175, false},
			{176, false},
			{177, false},
			{178, false},
			{179, true},
			{180, false},
			{181, true},
			{182, false},
			{183, false},
			{184, false},
			{185, false},
			{186, false},
			{187, false},
			{188, false},
			{189, false},
			{190, false},
			{191, true},
			{192, false},
			{193, true},
			{194, false},
			{195, false},
			{196, false},
			{197, true},
			{198, false},
			{199, true},
			{200, false},
			{201, false},
			{202, false},
			{203, false},
			{204, false},
			{205, false},
			{206, false},
			{207, false},
			{208, false},
			{209, false},
			{210, false},
			{211, true},
			{212, false},
			{213, false},
			{214, false},
			{215, false},
			{216, false},
			{217, false},
			{218, false},
			{219, false},
			{220, false},
			{221, false},
			{222, false},
			{223, true},
			{224, false},
			{225, false},
			{226, false},
			{227, true},
			{228, false},
			{229, true},
			{230, false},
			{231, false},
			{232, false},
			{233, true},
			{234, false},
			{235, false},
			{236, false},
			{237, false},
			{238, false},
			{239, true},
			{240, false},
			{241, true},
			{242, false},
			{243, false},
			{244, false},
			{245, false},
			{246, false},
			{247, false},
			{248, false},
			{249, false},
			{250, false},
			{251, true},
			{252, false},
			{253, false},
			{254, false},
			{255, false},
			{256, false},
			{257, true},
			{258, false},
			{259, false},
			{260, false},
			{261, false},
			{262, false},
			{263, true},
			{264, false},
			{265, false},
			{266, false},
			{267, false},
			{268, false},
			{269, true},
			{270, false},
			{271, true},
			{272, false},
			{273, false},
			{274, false},
			{275, false},
			{276, false},
			{277, true},
			{278, false},
			{279, false},
			{280, false},
			{281, true},
			{282, false},
			{283, true},
			{284, false},
			{285, false},
			{286, false},
			{287, false},
			{288, false},
			{289, false},
			{290, false},
			{291, false},
			{292, false},
			{293, true},
			{294, false},
			{295, false},
			{296, false},
			{297, false},
			{298, false},
			{299, false},
			{300, false},
			{301, false},
			{302, false},
			{303, false},
			{304, false},
			{305, false},
			{306, false},
			{307, true},
			{308, false},
			{309, false},
			{310, false},
			{311, true},
			{312, false},
			{313, true},
			{314, false},
			{315, false},
			{316, false},
			{317, true},
			{318, false},
			{319, false},
			{320, false},
			{321, false},
			{322, false},
			{323, false},
			{324, false},
			{325, false},
			{326, false},
			{327, false},
			{328, false},
			{329, false},
			{330, false},
			{331, true},
			{332, false},
			{333, false},
			{334, false},
			{335, false},
			{336, false},
			{337, true},
			{338, false},
			{339, false},
			{340, false},
			{341, false},
			{342, false},
			{343, false},
			{344, false},
			{345, false},
			{346, false},
			{347, true},
			{348, false},
			{349, true},
			{350, false},
			{351, false},
			{352, false},
			{353, true},
			{354, false},
			{355, false},
			{356, false},
			{357, false},
			{358, false},
			{359, true},
			{360, false},
			{361, false},
			{362, false},
			{363, false},
			{364, false},
			{365, false},
			{366, false},
			{367, true},
			{368, false},
			{369, false},
			{370, false},
			{371, false},
			{372, false},
			{373, true},
			{374, false},
			{375, false},
			{376, false},
			{377, false},
			{378, false},
			{379, true},
			{380, false},
			{381, false},
			{382, false},
			{383, true},
			{384, false},
			{385, false},
			{386, false},
			{387, false},
			{388, false},
			{389, true},
			{390, false},
			{391, false},
			{392, false},
			{393, false},
			{394, false},
			{395, false},
			{396, false},
			{397, true},
			{398, false},
			{399, false},
			{400, false},
			{401, true},
			{402, false},
			{403, false},
			{404, false},
			{405, false},
			{406, false},
			{407, false},
			{408, false},
			{409, true},
			{410, false},
			{411, false},
			{412, false},
			{413, false},
			{414, false},
			{415, false},
			{416, false},
			{417, false},
			{418, false},
			{419, true},
			{420, false},
			{421, true},
			{422, false},
			{423, false},
			{424, false},
			{425, false},
			{426, false},
			{427, false},
			{428, false},
			{429, false},
			{430, false},
			{431, true},
			{432, false},
			{433, true},
			{434, false},
			{435, false},
			{436, false},
			{437, false},
			{438, false},
			{439, true},
			{440, false},
			{441, false},
			{442, false},
			{443, true},
			{444, false},
			{445, false},
			{446, false},
			{447, false},
			{448, false},
			{449, true},
			{450, false},
			{451, false},
			{452, false},
			{453, false},
			{454, false},
			{455, false},
			{456, false},
			{457, true},
			{458, false},
			{459, false},
			{460, false},
			{461, true},
			{462, false},
			{463, true},
			{464, false},
			{465, false},
			{466, false},
			{467, true},
			{468, false},
			{469, false},
			{470, false},
			{471, false},
			{472, false},
			{473, false},
			{474, false},
			{475, false},
			{476, false},
			{477, false},
			{478, false},
			{479, true},
			{480, false},
			{481, false},
			{482, false},
			{483, false},
			{484, false},
			{485, false},
			{486, false},
			{487, true},
			{488, false},
			{489, false},
			{490, false},
			{491, true},
			{492, false},
			{493, false},
			{494, false},
			{495, false},
			{496, false},
			{497, false},
			{498, false},
			{499, true},
			{500, false},
			{501, false},
			{502, false},
			{503, true},
			{504, false},
			{505, false},
			{506, false},
			{507, false},
			{508, false},
			{509, true},
			{510, false},
			{511, false},
			{512, false},
			{513, false},
			{514, false},
			{515, false},
			{516, false},
			{517, false},
			{518, false},
			{519, false},
			{520, false},
			{521, true},
			{522, false},
			{523, true},
			{524, false},
			{525, false},
			{526, false},
			{527, false},
			{528, false},
			{529, false},
			{530, false},
			{531, false},
			{532, false},
			{533, false},
			{534, false},
			{535, false},
			{536, false},
			{537, false},
			{538, false},
			{539, false},
			{540, false},
			{541, true},
			{542, false},
			{543, false},
			{544, false},
			{545, false},
			{546, false},
			{547, true},
			{548, false},
			{549, false},
			{550, false},
			{551, false},
			{552, false},
			{553, false},
			{554, false},
			{555, false},
			{556, false},
			{557, true},
			{558, false},
			{559, false},
			{560, false},
			{561, false},
			{562, false},
			{563, true},
			{564, false},
			{565, false},
			{566, false},
			{567, false},
			{568, false},
			{569, true},
			{570, false},
			{571, true},
			{572, false},
			{573, false},
			{574, false},
			{575, false},
			{576, false},
			{577, true},
			{578, false},
			{579, false},
			{580, false},
			{581, false},
			{582, false},
			{583, false},
			{584, false},
			{585, false},
			{586, false},
			{587, true},
			{588, false},
			{589, false},
			{590, false},
			{591, false},
			{592, false},
			{593, true},
			{594, false},
			{595, false},
			{596, false},
			{597, false},
			{598, false},
			{599, true},
			{600, false},
			{601, true},
			{602, false},
			{603, false},
			{604, false},
			{605, false},
			{606, false},
			{607, true},
			{608, false},
			{609, false},
			{610, false},
			{611, false},
			{612, false},
			{613, true},
			{614, false},
			{615, false},
			{616, false},
			{617, true},
			{618, false},
			{619, true},
			{620, false},
			{621, false},
			{622, false},
			{623, false},
			{624, false},
			{625, false},
			{626, false},
			{627, false},
			{628, false},
			{629, false},
			{630, false},
			{631, true},
			{632, false},
			{633, false},
			{634, false},
			{635, false},
			{636, false},
			{637, false},
			{638, false},
			{639, false},
			{640, false},
			{641, true},
			{642, false},
			{643, true},
			{644, false},
			{645, false},
			{646, false},
			{647, true},
			{648, false},
			{649, false},
			{650, false},
			{651, false},
			{652, false},
			{653, true},
			{654, false},
			{655, false},
			{656, false},
			{657, false},
			{658, false},
			{659, true},
			{660, false},
			{661, true},
			{662, false},
			{663, false},
			{664, false},
			{665, false},
			{666, false},
			{667, false},
			{668, false},
			{669, false},
			{670, false},
			{671, false},
			{672, false},
			{673, true},
			{674, false},
			{675, false},
			{676, false},
			{677, true},
			{678, false},
			{679, false},
			{680, false},
			{681, false},
			{682, false},
			{683, true},
			{684, false},
			{685, false},
			{686, false},
			{687, false},
			{688, false},
			{689, false},
			{690, false},
			{691, true},
			{692, false},
			{693, false},
			{694, false},
			{695, false},
			{696, false},
			{697, false},
			{698, false},
			{699, false},
			{700, false},
			{701, true},
			{702, false},
			{703, false},
			{704, false},
			{705, false},
			{706, false},
			{707, false},
			{708, false},
			{709, true},
			{710, false},
			{711, false},
			{712, false},
			{713, false},
			{714, false},
			{715, false},
			{716, false},
			{717, false},
			{718, false},
			{719, true},
			{720, false},
			{721, false},
			{722, false},
			{723, false},
			{724, false},
			{725, false},
			{726, false},
			{727, true},
			{728, false},
			{729, false},
			{730, false},
			{731, false},
			{732, false},
			{733, true},
			{734, false},
			{735, false},
			{736, false},
			{737, false},
			{738, false},
			{739, true},
			{740, false},
			{741, false},
			{742, false},
			{743, true},
			{744, false},
			{745, false},
			{746, false},
			{747, false},
			{748, false},
			{749, false},
			{750, false},
			{751, true},
			{752, false},
			{753, false},
			{754, false},
			{755, false},
			{756, false},
			{757, true},
			{758, false},
			{759, false},
			{760, false},
			{761, true},
			{762, false},
			{763, false},
			{764, false},
			{765, false},
			{766, false},
			{767, false},
			{768, false},
			{769, true},
			{770, false},
			{771, false},
			{772, false},
			{773, true},
			{774, false},
			{775, false},
			{776, false},
			{777, false},
			{778, false},
			{779, false},
			{780, false},
			{781, false},
			{782, false},
			{783, false},
			{784, false},
			{785, false},
			{786, false},
			{787, true},
			{788, false},
			{789, false},
			{790, false},
			{791, false},
			{792, false},
			{793, false},
			{794, false},
			{795, false},
			{796, false},
			{797, true},
			{798, false},
			{799, false},
			{800, false},
			{801, false},
			{802, false},
			{803, false},
			{804, false},
			{805, false},
			{806, false},
			{807, false},
			{808, false},
			{809, true},
			{810, false},
			{811, true},
			{812, false},
			{813, false},
			{814, false},
			{815, false},
			{816, false},
			{817, false},
			{818, false},
			{819, false},
			{820, false},
			{821, true},
			{822, false},
			{823, true},
			{824, false},
			{825, false},
			{826, false},
			{827, true},
			{828, false},
			{829, true},
			{830, false},
			{831, false},
			{832, false},
			{833, false},
			{834, false},
			{835, false},
			{836, false},
			{837, false},
			{838, false},
			{839, true},
			{840, false},
			{841, false},
			{842, false},
			{843, false},
			{844, false},
			{845, false},
			{846, false},
			{847, false},
			{848, false},
			{849, false},
			{850, false},
			{851, false},
			{852, false},
			{853, true},
			{854, false},
			{855, false},
			{856, false},
			{857, true},
			{858, false},
			{859, true},
			{860, false},
			{861, false},
			{862, false},
			{863, true},
			{864, false},
			{865, false},
			{866, false},
			{867, false},
			{868, false},
			{869, false},
			{870, false},
			{871, false},
			{872, false},
			{873, false},
			{874, false},
			{875, false},
			{876, false},
			{877, true},
			{878, false},
			{879, false},
			{880, false},
			{881, true},
			{882, false},
			{883, true},
			{884, false},
			{885, false},
			{886, false},
			{887, true},
			{888, false},
			{889, false},
			{890, false},
			{891, false},
			{892, false},
			{893, false},
			{894, false},
			{895, false},
			{896, false},
			{897, false},
			{898, false},
			{899, false},
			{900, false},
			{901, false},
			{902, false},
			{903, false},
			{904, false},
			{905, false},
			{906, false},
			{907, true},
			{908, false},
			{909, false},
			{910, false},
			{911, true},
			{912, false},
			{913, false},
			{914, false},
			{915, false},
			{916, false},
			{917, false},
			{918, false},
			{919, true},
			{920, false},
			{921, false},
			{922, false},
			{923, false},
			{924, false},
			{925, false},
			{926, false},
			{927, false},
			{928, false},
			{929, true},
			{930, false},
			{931, false},
			{932, false},
			{933, false},
			{934, false},
			{935, false},
			{936, false},
			{937, true},
			{938, false},
			{939, false},
			{940, false},
			{941, true},
			{942, false},
			{943, false},
			{944, false},
			{945, false},
			{946, false},
			{947, true},
			{948, false},
			{949, false},
			{950, false},
			{951, false},
			{952, false},
			{953, true},
			{954, false},
			{955, false},
			{956, false},
			{957, false},
			{958, false},
			{959, false},
			{960, false},
			{961, false},
			{962, false},
			{963, false},
			{964, false},
			{965, false},
			{966, false},
			{967, true},
			{968, false},
			{969, false},
			{970, false},
			{971, true},
			{972, false},
			{973, false},
			{974, false},
			{975, false},
			{976, false},
			{977, true},
			{978, false},
			{979, false},
			{980, false},
			{981, false},
			{982, false},
			{983, true},
			{984, false},
			{985, false},
			{986, false},
			{987, false},
			{988, false},
			{989, false},
			{990, false},
			{991, true},
			{992, false},
			{993, false},
			{994, false},
			{995, false},
			{996, false},
			{997, true},
			{998, false},
			{999, false},
			{1000, false},
			{1001, false},
			{1002, false},
			{1003, false},
			{1004, false},
			{1005, false},
			{1006, false},
			{1007, false},
			{1008, false},
			{1009, true},
			{1010, false},
			{1011, false},
			{1012, false},
			{1013, true},
			{1014, false},
			{1015, false},
			{1016, false},
			{1017, false},
			{1018, false},
			{1019, true},
			{1020, false},
			{1021, true},
			{1022, false},
			{1023, false},
			{1024, false},
			{1025, false},
			{1026, false},
			{1027, false},
			{1028, false},
			{1029, false},
			{1030, false},
			{1031, true},
			{1032, false},
			{1033, true},
			{1034, false},
			{1035, false},
			{1036, false},
			{1037, false},
			{1038, false},
			{1039, true},
			{1040, false},
			{1041, false},
			{1042, false},
			{1043, false},
			{1044, false},
			{1045, false},
			{1046, false},
			{1047, false},
			{1048, false},
			{1049, true},
			{1050, false},
			{1051, true},
			{1052, false},
			{1053, false},
			{1054, false},
			{1055, false},
			{1056, false},
			{1057, false},
			{1058, false},
			{1059, false},
			{1060, false},
			{1061, true},
			{1062, false},
			{1063, true},
			{1064, false},
			{1065, false},
			{1066, false},
			{1067, false},
			{1068, false},
			{1069, true},
			{1070, false},
			{1071, false},
			{1072, false},
			{1073, false},
			{1074, false},
			{1075, false},
			{1076, false},
			{1077, false},
			{1078, false},
			{1079, false},
			{1080, false},
			{1081, false},
			{1082, false},
			{1083, false},
			{1084, false},
			{1085, false},
			{1086, false},
			{1087, true},
			{1088, false},
			{1089, false},
			{1090, false},
			{1091, true},
			{1092, false},
			{1093, true},
			{1094, false},
			{1095, false},
			{1096, false},
			{1097, true},
			{1098, false},
			{1099, false},
			{1100, false},
			{1101, false},
			{1102, false},
			{1103, true},
			{1104, false},
			{1105, false},
			{1106, false},
			{1107, false},
			{1108, false},
			{1109, true},
			{1110, false},
			{1111, false},
			{1112, false},
			{1113, false},
			{1114, false},
			{1115, false},
			{1116, false},
			{1117, true},
			{1118, false},
			{1119, false},
			{1120, false},
			{1121, false},
			{1122, false},
			{1123, true},
			{1124, false},
			{1125, false},
			{1126, false},
			{1127, false},
			{1128, false},
			{1129, true},
			{1130, false},
			{1131, false},
			{1132, false},
			{1133, false},
			{1134, false},
			{1135, false},
			{1136, false},
			{1137, false},
			{1138, false},
			{1139, false},
			{1140, false},
			{1141, false},
			{1142, false},
			{1143, false},
			{1144, false},
			{1145, false},
			{1146, false},
			{1147, false},
			{1148, false},
			{1149, false},
			{1150, false},
			{1151, true},
			{1152, false},
			{1153, true},
			{1154, false},
			{1155, false},
			{1156, false},
			{1157, false},
			{1158, false},
			{1159, false},
			{1160, false},
			{1161, false},
			{1162, false},
			{1163, true},
			{1164, false},
			{1165, false},
			{1166, false},
			{1167, false},
			{1168, false},
			{1169, false},
			{1170, false},
			{1171, true},
			{1172, false},
			{1173, false},
			{1174, false},
			{1175, false},
			{1176, false},
			{1177, false},
			{1178, false},
			{1179, false},
			{1180, false},
			{1181, true},
			{1182, false},
			{1183, false},
			{1184, false},
			{1185, false},
			{1186, false},
			{1187, true},
			{1188, false},
			{1189, false},
			{1190, false},
			{1191, false},
			{1192, false},
			{1193, true},
			{1194, false},
			{1195, false},
			{1196, false},
			{1197, false},
			{1198, false},
			{1199, false},
			{1200, false},
			{1201, true},
			{1202, false},
			{1203, false},
			{1204, false},
			{1205, false},
			{1206, false},
			{1207, false},
			{1208, false},
			{1209, false},
			{1210, false},
			{1211, false},
			{1212, false},
			{1213, true},
			{1214, false},
			{1215, false},
			{1216, false},
			{1217, true},
			{1218, false},
			{1219, false},
			{1220, false},
			{1221, false},
			{1222, false},
			{1223, true},
			{1224, false},
			{1225, false},
			{1226, false},
			{1227, false},
			{1228, false},
			{1229, true},
			{1230, false},
			{1231, true},
			{1232, false},
			{1233, false},
			{1234, false},
			{1235, false},
			{1236, false},
			{1237, true},
			{1238, false},
			{1239, false},
			{1240, false},
			{1241, false},
			{1242, false},
			{1243, false},
			{1244, false},
			{1245, false},
			{1246, false},
			{1247, false},
			{1248, false},
			{1249, true},
			{1250, false},
			{1251, false},
			{1252, false},
			{1253, false},
			{1254, false},
			{1255, false},
			{1256, false},
			{1257, false},
			{1258, false},
			{1259, true},
			{1260, false},
			{1261, false},
			{1262, false},
			{1263, false},
			{1264, false},
			{1265, false},
			{1266, false},
			{1267, false},
			{1268, false},
			{1269, false},
			{1270, false},
			{1271, false},
			{1272, false},
			{1273, false},
			{1274, false},
			{1275, false},
			{1276, false},
			{1277, true},
			{1278, false},
			{1279, true},
			{1280, false},
			{1281, false},
			{1282, false},
			{1283, true},
			{1284, false},
			{1285, false},
			{1286, false},
			{1287, false},
			{1288, false},
			{1289, true},
			{1290, false},
			{1291, true},
			{1292, false},
			{1293, false},
			{1294, false},
			{1295, false},
			{1296, false},
			{1297, true},
			{1298, false},
			{1299, false},
			{1300, false},
			{1301, true},
			{1302, false},
			{1303, true},
			{1304, false},
			{1305, false},
			{1306, false},
			{1307, true},
			{1308, false},
			{1309, false},
			{1310, false},
			{1311, false},
			{1312, false},
			{1313, false},
			{1314, false},
			{1315, false},
			{1316, false},
			{1317, false},
			{1318, false},
			{1319, true},
			{1320, false},
			{1321, true},
			{1322, false},
			{1323, false},
			{1324, false},
			{1325, false},
			{1326, false},
			{1327, true},
			{1328, false},
			{1329, false},
			{1330, false},
			{1331, false},
			{1332, false},
			{1333, false},
			{1334, false},
			{1335, false},
			{1336, false},
			{1337, false},
			{1338, false},
			{1339, false},
			{1340, false},
			{1341, false},
			{1342, false},
			{1343, false},
			{1344, false},
			{1345, false},
			{1346, false},
			{1347, false},
			{1348, false},
			{1349, false},
			{1350, false},
			{1351, false},
			{1352, false},
			{1353, false},
			{1354, false},
			{1355, false},
			{1356, false},
			{1357, false},
			{1358, false},
			{1359, false},
			{1360, false},
			{1361, true},
			{1362, false},
			{1363, false},
			{1364, false},
			{1365, false},
			{1366, false},
			{1367, true},
			{1368, false},
			{1369, false},
			{1370, false},
			{1371, false},
			{1372, false},
			{1373, true},
			{1374, false},
			{1375, false},
			{1376, false},
			{1377, false},
			{1378, false},
			{1379, false},
			{1380, false},
			{1381, true},
			{1382, false},
			{1383, false},
			{1384, false},
			{1385, false},
			{1386, false},
			{1387, false},
			{1388, false},
			{1389, false},
			{1390, false},
			{1391, false},
			{1392, false},
			{1393, false},
			{1394, false},
			{1395, false},
			{1396, false},
			{1397, false},
			{1398, false},
			{1399, true},
			{1400, false},
			{1401, false},
			{1402, false},
			{1403, false},
			{1404, false},
			{1405, false},
			{1406, false},
			{1407, false},
			{1408, false},
			{1409, true},
			{1410, false},
			{1411, false},
			{1412, false},
			{1413, false},
			{1414, false},
			{1415, false},
			{1416, false},
			{1417, false},
			{1418, false},
			{1419, false},
			{1420, false},
			{1421, false},
			{1422, false},
			{1423, true},
			{1424, false},
			{1425, false},
			{1426, false},
			{1427, true},
			{1428, false},
			{1429, true},
			{1430, false},
			{1431, false},
			{1432, false},
			{1433, true},
			{1434, false},
			{1435, false},
			{1436, false},
			{1437, false},
			{1438, false},
			{1439, true},
			{1440, false},
			{1441, false},
			{1442, false},
			{1443, false},
			{1444, false},
			{1445, false},
			{1446, false},
			{1447, true},
			{1448, false},
			{1449, false},
			{1450, false},
			{1451, true},
			{1452, false},
			{1453, true},
			{1454, false},
			{1455, false},
			{1456, false},
			{1457, false},
			{1458, false},
			{1459, true},
			{1460, false},
			{1461, false},
			{1462, false},
			{1463, false},
			{1464, false},
			{1465, false},
			{1466, false},
			{1467, false},
			{1468, false},
			{1469, false},
			{1470, false},
			{1471, true},
			{1472, false},
			{1473, false},
			{1474, false},
			{1475, false},
			{1476, false},
			{1477, false},
			{1478, false},
			{1479, false},
			{1480, false},
			{1481, true},
			{1482, false},
			{1483, true},
			{1484, false},
			{1485, false},
			{1486, false},
			{1487, true},
			{1488, false},
			{1489, true},
			{1490, false},
			{1491, false},
			{1492, false},
			{1493, true},
			{1494, false},
			{1495, false},
			{1496, false},
			{1497, false},
			{1498, false},
			{1499, true},
			{1500, false},
			{1501, false},
			{1502, false},
			{1503, false},
			{1504, false},
			{1505, false},
			{1506, false},
			{1507, false},
			{1508, false},
			{1509, false},
			{1510, false},
			{1511, true},
			{1512, false},
			{1513, false},
			{1514, false},
			{1515, false},
			{1516, false},
			{1517, false},
			{1518, false},
			{1519, false},
			{1520, false},
			{1521, false},
			{1522, false},
			{1523, true},
			{1524, false},
			{1525, false},
			{1526, false},
			{1527, false},
			{1528, false},
			{1529, false},
			{1530, false},
			{1531, true},
			{1532, false},
			{1533, false},
			{1534, false},
			{1535, false},
			{1536, false},
			{1537, false},
			{1538, false},
			{1539, false},
			{1540, false},
			{1541, false},
			{1542, false},
			{1543, true},
			{1544, false},
			{1545, false},
			{1546, false},
			{1547, false},
			{1548, false},
			{1549, true},
			{1550, false},
			{1551, false},
			{1552, false},
			{1553, true},
			{1554, false},
			{1555, false},
			{1556, false},
			{1557, false},
			{1558, false},
			{1559, true},
			{1560, false},
			{1561, false},
			{1562, false},
			{1563, false},
			{1564, false},
			{1565, false},
			{1566, false},
			{1567, true},
			{1568, false},
			{1569, false},
			{1570, false},
			{1571, true},
			{1572, false},
			{1573, false},
			{1574, false},
			{1575, false},
			{1576, false},
			{1577, false},
			{1578, false},
			{1579, true},
			{1580, false},
			{1581, false},
			{1582, false},
			{1583, true},
			{1584, false},
			{1585, false},
			{1586, false},
			{1587, false},
			{1588, false},
			{1589, false},
			{1590, false},
			{1591, false},
			{1592, false},
			{1593, false},
			{1594, false},
			{1595, false},
			{1596, false},
			{1597, true},
			{1598, false},
			{1599, false},
			{1600, false},
			{1601, true},
			{1602, false},
			{1603, false},
			{1604, false},
			{1605, false},
			{1606, false},
			{1607, true},
			{1608, false},
			{1609, true},
			{1610, false},
			{1611, false},
			{1612, false},
			{1613, true},
			{1614, false},
			{1615, false},
			{1616, false},
			{1617, false},
			{1618, false},
			{1619, true},
			{1620, false},
			{1621, true},
			{1622, false},
			{1623, false},
			{1624, false},
			{1625, false},
			{1626, false},
			{1627, true},
			{1628, false},
			{1629, false},
			{1630, false},
			{1631, false},
			{1632, false},
			{1633, false},
			{1634, false},
			{1635, false},
			{1636, false},
			{1637, true},
			{1638, false},
			{1639, false},
			{1640, false},
			{1641, false},
			{1642, false},
			{1643, false},
			{1644, false},
			{1645, false},
			{1646, false},
			{1647, false},
			{1648, false},
			{1649, false},
			{1650, false},
			{1651, false},
			{1652, false},
			{1653, false},
			{1654, false},
			{1655, false},
			{1656, false},
			{1657, true},
			{1658, false},
			{1659, false},
			{1660, false},
			{1661, false},
			{1662, false},
			{1663, true},
			{1664, false},
			{1665, false},
			{1666, false},
			{1667, true},
			{1668, false},
			{1669, true},
			{1670, false},
			{1671, false},
			{1672, false},
			{1673, false},
			{1674, false},
			{1675, false},
			{1676, false},
			{1677, false},
			{1678, false},
			{1679, false},
			{1680, false},
			{1681, false},
			{1682, false},
			{1683, false},
			{1684, false},
			{1685, false},
			{1686, false},
			{1687, false},
			{1688, false},
			{1689, false},
			{1690, false},
			{1691, false},
			{1692, false},
			{1693, true},
			{1694, false},
			{1695, false},
			{1696, false},
			{1697, true},
			{1698, false},
			{1699, true},
			{1700, false},
			{1701, false},
			{1702, false},
			{1703, false},
			{1704, false},
			{1705, false},
			{1706, false},
			{1707, false},
			{1708, false},
			{1709, true},
			{1710, false},
			{1711, false},
			{1712, false},
			{1713, false},
			{1714, false},
			{1715, false},
			{1716, false},
			{1717, false},
			{1718, false},
			{1719, false},
			{1720, false},
			{1721, true},
			{1722, false},
			{1723, true},
			{1724, false},
			{1725, false},
			{1726, false},
			{1727, false},
			{1728, false},
			{1729, false},
			{1730, false},
			{1731, false},
			{1732, false},
			{1733, true},
			{1734, false},
			{1735, false},
			{1736, false},
			{1737, false},
			{1738, false},
			{1739, false},
			{1740, false},
			{1741, true},
			{1742, false},
			{1743, false},
			{1744, false},
			{1745, false},
			{1746, false},
			{1747, true},
			{1748, false},
			{1749, false},
			{1750, false},
			{1751, false},
			{1752, false},
			{1753, true},
			{1754, false},
			{1755, false},
			{1756, false},
			{1757, false},
			{1758, false},
			{1759, true},
			{1760, false},
			{1761, false},
			{1762, false},
			{1763, false},
			{1764, false},
			{1765, false},
			{1766, false},
			{1767, false},
			{1768, false},
			{1769, false},
			{1770, false},
			{1771, false},
			{1772, false},
			{1773, false},
			{1774, false},
			{1775, false},
			{1776, false},
			{1777, true},
			{1778, false},
			{1779, false},
			{1780, false},
			{1781, false},
			{1782, false},
			{1783, true},
			{1784, false},
			{1785, false},
			{1786, false},
			{1787, true},
			{1788, false},
			{1789, true},
			{1790, false},
			{1791, false},
			{1792, false},
			{1793, false},
			{1794, false},
			{1795, false},
			{1796, false},
			{1797, false},
			{1798, false},
			{1799, false},
			{1800, false},
			{1801, true},
			{1802, false},
			{1803, false},
			{1804, false},
			{1805, false},
			{1806, false},
			{1807, false},
			{1808, false},
			{1809, false},
			{1810, false},
			{1811, true},
			{1812, false},
			{1813, false},
			{1814, false},
			{1815, false},
			{1816, false},
			{1817, false},
			{1818, false},
			{1819, false},
			{1820, false},
			{1821, false},
			{1822, false},
			{1823, true},
			{1824, false},
			{1825, false},
			{1826, false},
			{1827, false},
			{1828, false},
			{1829, false},
			{1830, false},
			{1831, true},
			{1832, false},
			{1833, false},
			{1834, false},
			{1835, false},
			{1836, false},
			{1837, false},
			{1838, false},
			{1839, false},
			{1840, false},
			{1841, false},
			{1842, false},
			{1843, false},
			{1844, false},
			{1845, false},
			{1846, false},
			{1847, true},
			{1848, false},
			{1849, false},
			{1850, false},
			{1851, false},
			{1852, false},
			{1853, false},
			{1854, false},
			{1855, false},
			{1856, false},
			{1857, false},
			{1858, false},
			{1859, false},
			{1860, false},
			{1861, true},
			{1862, false},
			{1863, false},
			{1864, false},
			{1865, false},
			{1866, false},
			{1867, true},
			{1868, false},
			{1869, false},
			{1870, false},
			{1871, true},
			{1872, false},
			{1873, true},
			{1874, false},
			{1875, false},
			{1876, false},
			{1877, true},
			{1878, false},
			{1879, true},
			{1880, false},
			{1881, false},
			{1882, false},
			{1883, false},
			{1884, false},
			{1885, false},
			{1886, false},
			{1887, false},
			{1888, false},
			{1889, true},
			{1890, false},
			{1891, false},
			{1892, false},
			{1893, false},
			{1894, false},
			{1895, false},
			{1896, false},
			{1897, false},
			{1898, false},
			{1899, false},
			{1900, false},
			{1901, true},
			{1902, false},
			{1903, false},
			{1904, false},
			{1905, false},
			{1906, false},
			{1907, true},
			{1908, false},
			{1909, false},
			{1910, false},
			{1911, false},
			{1912, false},
			{1913, true},
			{1914, false},
			{1915, false},
			{1916, false},
			{1917, false},
			{1918, false},
			{1919, false},
			{1920, false},
			{1921, false},
			{1922, false},
			{1923, false},
			{1924, false},
			{1925, false},
			{1926, false},
			{1927, false},
			{1928, false},
			{1929, false},
			{1930, false},
			{1931, true},
			{1932, false},
			{1933, true},
			{1934, false},
			{1935, false},
			{1936, false},
			{1937, false},
			{1938, false},
			{1939, false},
			{1940, false},
			{1941, false},
			{1942, false},
			{1943, false},
			{1944, false},
			{1945, false},
			{1946, false},
			{1947, false},
			{1948, false},
			{1949, true},
			{1950, false},
			{1951, true},
			{1952, false},
			{1953, false},
			{1954, false},
			{1955, false},
			{1956, false},
			{1957, false},
			{1958, false},
			{1959, false},
			{1960, false},
			{1961, false},
			{1962, false},
			{1963, false},
			{1964, false},
			{1965, false},
			{1966, false},
			{1967, false},
			{1968, false},
			{1969, false},
			{1970, false},
			{1971, false},
			{1972, false},
			{1973, true},
			{1974, false},
			{1975, false},
			{1976, false},
			{1977, false},
			{1978, false},
			{1979, true},
			{1980, false},
			{1981, false},
			{1982, false},
			{1983, false},
			{1984, false},
			{1985, false},
			{1986, false},
			{1987, true},
			{1988, false},
			{1989, false},
			{1990, false},
			{1991, false},
			{1992, false},
			{1993, true},
			{1994, false},
			{1995, false},
			{1996, false},
			{1997, true},
			{1998, false},
			{1999, true},
			{2000, false},
			{2001, false},
			{2002, false},
			{2003, true},
			{2004, false},
			{2005, false},
			{2006, false},
			{2007, false},
			{2008, false},
			{2009, false},
			{2010, false},
			{2011, true},
			{2012, false},
			{2013, false},
			{2014, false},
			{2015, false},
			{2016, false},
			{2017, true},
			{2018, false},
			{2019, false},
			{2020, false},
			{2021, false},
			{2022, false},
			{2023, false},
			{2024, false},
			{2025, false},
			{2026, false},
			{2027, true},
			{2028, false},
			{2029, true},
			{2030, false},
			{2031, false},
			{2032, false},
			{2033, false},
			{2034, false},
			{2035, false},
			{2036, false},
			{2037, false},
			{2038, false},
			{2039, true},
			{2040, false},
			{2041, false},
			{2042, false},
			{2043, false},
			{2044, false},
			{2045, false},
			{2046, false},
			{2047, false},
			{2048, false},
			{2049, false},
			{2050, false},
			{2051, false},
			{2052, false},
			{2053, true},
			{2054, false},
			{2055, false},
			{2056, false},
			{2057, false},
			{2058, false},
			{2059, false},
			{2060, false},
			{2061, false},
			{2062, false},
			{2063, true},
			{2064, false},
			{2065, false},
			{2066, false},
			{2067, false},
			{2068, false},
			{2069, true},
			{2070, false},
			{2071, false},
			{2072, false},
			{2073, false},
			{2074, false},
			{2075, false},
			{2076, false},
			{2077, false},
			{2078, false},
			{2079, false},
			{2080, false},
			{2081, true},
			{2082, false},
			{2083, true},
			{2084, false},
			{2085, false},
			{2086, false},
			{2087, true},
			{2088, false},
			{2089, true},
			{2090, false},
			{2091, false},
			{2092, false},
			{2093, false},
			{2094, false},
			{2095, false},
			{2096, false},
			{2097, false},
			{2098, false},
			{2099, true},
			{2100, false},
			{2101, false},
			{2102, false},
			{2103, false},
			{2104, false},
			{2105, false},
			{2106, false},
			{2107, false},
			{2108, false},
			{2109, false},
			{2110, false}
				};
		
			return Arrays.asList(data);
	}

@Test
	public void testPrimeNumberChecker() {
System.out.println("Is " + inputNumber + " a prime number? - " + expectedResult);
	assertEquals(expectedResult, pn.validate(inputNumber));
	}
}