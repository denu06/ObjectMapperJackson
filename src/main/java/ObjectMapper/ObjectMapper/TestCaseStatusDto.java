package ObjectMapper.ObjectMapper;

public class TestCaseStatusDto
{

	@Override
	public String toString()
	{
		return "TestCaseStatusDto [tcId=" + tcId + ", status=" + status + "]";
	}

	public String getTcId()
	{
		return tcId;
	}

	public void setTcId(String tcId)
	{
		this.tcId = tcId;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	private String	tcId;
	private String	status;

	public TestCaseStatusDto()
	{
		// TODO Auto-generated constructor stub

	}

	public TestCaseStatusDto(String tcId, String status)
	{
		// TODO Auto-generated constructor stub
		this.tcId = tcId;
		this.status = status;
	}

}
