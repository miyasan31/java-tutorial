import java.io.*;

class sample34
{
	public static void main (String[]args) throws IOException
	{
		
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";

		System.out.println("������͂��Ă�������");
		str = br.readLine();
		int num = Integer.parseInt(str);

		if( !(num >= 1 && num <= 12)){
			System.out.println("�����Ԉ���Ă��܂�");
			return;
		}	
			
			switch(num){
				case 6:
				case 12:
					System.out.println("�Փ��͂���܂���");
					break;
				
				case 1:
					System.out.println("1��1���F���U");
					System.out.println("1��13���F���l�̓�");
					break;
				case 2:
					System.out.println("2��11���F�����L�O�̓�");
					System.out.println("2��23���F�V�c�a����");
					break;
				case 3:
					System.out.println("3��20���F�t���̓�" );
					break;
				case 4:
					System.out.println("4��29���F���a�̓�");
					break;
				case 5:
					System.out.println("5��3���F���@�L�O�̓�");
					System.out.println("5��4���F�݂ǂ�̓�");
					System.out.println("5��5��:���ǂ��̓�");
					break;
				case 7:
					System.out.println("7��23���F�C�̓�");
					System.out.println("7��24���F�X�|�[�c�̓�");
					break;
				case 8:
					System.out.println("8��11���F�R�̓�");
					break;
				case 9:
					System.out.println("9��21���F�h�V");
					System.out.println("9��22���F�H���̓�");
					break;
				case 11:
					System.out.println("11��3��:�X�|�[�c�̓�");
					System.out.println("11��23���F�h�V���ӂ̓�");
					break;
			}
		
	}
}