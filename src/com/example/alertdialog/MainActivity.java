package com.example.alertdialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView text_01;
	private Button but_01;
	private Button but_02;
	private Button but_03;
	private Button but_04;
	private Button but_05;
	private Button but_06;
	private Button but_07;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		text_01 = (TextView) findViewById(R.id.text_01);
		but_01 = (Button) findViewById(R.id.but_01);
		but_02 = (Button) findViewById(R.id.but_02);
		but_03 = (Button) findViewById(R.id.but_03);
		but_04 = (Button) findViewById(R.id.but_04);
		but_05 = (Button) findViewById(R.id.but_05);
		but_06 = (Button) findViewById(R.id.but_06);
		but_07 = (Button) findViewById(R.id.but_07);
		
		but_01.setOnClickListener(ock);
		but_02.setOnClickListener(ock);
		but_03.setOnClickListener(ock);
		but_04.setOnClickListener(ock);
		but_05.setOnClickListener(ock);
		but_06.setOnClickListener(ock);
		but_07.setOnClickListener(ock);
		
	}
	// ����
	private OnClickListener ock = new OnClickListener() {
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.but_01:
				showExitDialog01();
				break;
			case R.id.but_02:
				showExitDialog02();
				break;
			case R.id.but_03:
				showExitDialog03();
				break;
			case R.id.but_04:
				showExitDialog04();
				break;
			case R.id.but_05:
				showExitDialog05();
				break;
			case R.id.but_06:
				showExitDialog06();
				break;
			case R.id.but_07:
				showExitDialog07();
				break;
			default:
				break;
			}
			
		}
	};
	// ����Ϣ��ʾ��
	private void showExitDialog01(){
		// Builder�е�"this"��������������Create��
		new AlertDialog.Builder(this)
			.setTitle("����")
			.setMessage("�򵥵���Ϣ��ʾ��")
			.setPositiveButton("ȷ��", null)
			.show();
	}
	// �����ǡ��͡��񡱵���ʾ��
	private void showExitDialog02(){
		new AlertDialog.Builder(this)
			.setTitle("��ȷ��������ʾ��")
			.setMessage("ȷ����")
			.setPositiveButton("��", null)
			.setNegativeButton("��", null)
			.show();
	}
	// �������ı�����ʾ��
	private void showExitDialog03(){
		final EditText edt = new EditText(this);
		// ���������Ĵ�С
		edt.setMinLines(3);
		new AlertDialog.Builder(this)
			.setTitle("������")
			.setIcon(android.R.drawable.ic_dialog_info)
			.setView(edt)
			.setPositiveButton("ȷ��", new DialogInterface.OnClickListener() {
				// ����������ִ��ݸ�text
				public void onClick(DialogInterface arg0, int arg1) {
					text_01.setText(edt.getText().toString());
				}
			})
			.setNegativeButton("ȡ��", null)
			.show();
		
	}
	// ��ѡ��ʾ��
	private void showExitDialog04(){
		new AlertDialog.Builder(this)
			.setTitle("��ѡ��")
			.setIcon(android.R.drawable.ic_dialog_info)
			.setSingleChoiceItems(new String[]{"ѡ��1","ѡ��2","ѡ��3","ѡ��4","ѡ��5","ѡ��6"}, -1, new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface arg0, int arg1) {
					switch (arg1) {
					case 0:text_01.setText("ѡ����һ");break;
					case 1:text_01.setText("ѡ���˶�");break;
					case 2:text_01.setText("ѡ������");break;
					default:
						break;
					}
					arg0.dismiss();
				}
			})
			.setNegativeButton("ȡ��", null)
			.show();
	}
	// ��ѡ��ʾ��
	private void showExitDialog05(){
		new AlertDialog.Builder(this)
			.setTitle("��ѡ��")
			.setMultiChoiceItems(new String[]{"ѡ��1","ѡ��2","ѡ��3","ѡ��4","ѡ��5","ѡ��6"}, null, null)
			.setPositiveButton("ȷ��",null)
			.setNegativeButton("ȡ��",null)
			.show();
	}
	// �б�Ի���
	private void showExitDialog06(){
		
		new AlertDialog.Builder(this)
			.setTitle("�б��")
			.setItems(new String[]{"�б�1","�б�2","�б�3","�б�4","�б�5"}, null)
			.setNegativeButton("ȷ��", null)
			.show();
	}
	// ��ʾͼƬ�ĶԻ���
	private void showExitDialog07(){
		ImageView img = new ImageView(this);
		img.setImageResource(R.drawable.hua);
		new AlertDialog.Builder(this)
			.setTitle("ͼƬ��")
			.setView(img)
			.setPositiveButton("ȷ��", null)
			.show();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
