package harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Map<String, List<Field>> fieldsMap = getFieldsMap();

		Consumer<Field> printer = field -> {
			System.out.println(Modifier.toString(field.getModifiers()) + " " + field.getType().getSimpleName() + " " + field.getName());
		};

		String command = scanner.nextLine();

		while (!command.equals("HARVEST")){
			switch (command){
				case "private":
					fieldsMap.get("private").forEach(printer);
					break;
				case "public":
					fieldsMap.get("public").forEach(printer);
					break;
				case "protected":
					fieldsMap.get("protected").forEach(printer);
					break;
				case "all":
					fieldsMap.get("all").forEach(printer);
					break;
			}
			command = scanner.nextLine();
		}
	}

	private static Map<String, List<Field>> getFieldsMap() {
		Map<String, List<Field>> fieldsMap = new HashMap<>();
		fieldsMap.put("private", new ArrayList<>());
		fieldsMap.put("public", new ArrayList<>());
		fieldsMap.put("protected", new ArrayList<>());
		List<Field> allFields = Arrays.asList(RichSoilLand.class.getDeclaredFields());
		fieldsMap.put("all", allFields);

		allFields.forEach(field -> {
			String modifier = Modifier.toString(field.getModifiers());
			switch (modifier){
				case "private":
					fieldsMap.get("private").add(field);
					break;
				case "public":
					fieldsMap.get("public").add(field);
					break;
				case "protected":
					fieldsMap.get("protected").add(field);
					break;
			}
		});
		return fieldsMap;
	}
}
