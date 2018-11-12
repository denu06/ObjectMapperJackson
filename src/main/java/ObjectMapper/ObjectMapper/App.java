package ObjectMapper.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper objectMapper = new ObjectMapper();
		List<TestCaseStatusDto> aa = new ArrayList<TestCaseStatusDto>();

		aa.add(new TestCaseStatusDto("QM-1", "pass"));
		aa.add(new TestCaseStatusDto("QM-2", "fail"));

		String finalJson = objectMapper.writeValueAsString(aa);
		System.out.println(finalJson);
		List<TestCaseStatusDto> listCar = objectMapper.readValue(finalJson, new TypeReference<List<TestCaseStatusDto>>()
		{
		});

		System.out.println(listCar);

	}
}
