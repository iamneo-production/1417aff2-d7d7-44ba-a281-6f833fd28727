package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Bank;
import com.example.demo.Model.login;
import com.example.demo.Model.Payment;
import com.example.demo.Model.Contact;
import com.example.demo.Repo.loginRepo;
import com.example.demo.Service.ApiService;
import com.example.demo.Service.ContactService;
import com.example.demo.Service.PaymentService;
import com.example.demo.Service.loginService;


@RestController
public class ApiController {
	
	@Autowired
	ApiService stuService;
	@Autowired
	 loginService stdService;
	@Autowired
	 ContactService stmService;
	@Autowired
	 PaymentService stpService;
	@PostMapping("/addDetails")
	public Bank addInfo(@RequestBody Bank st)
	{
		return stuService.saveDetails(st);
		}
	@PostMapping("/login")
	public login addInfo(@RequestBody login a)
	{
		return stdService.savelogin(a);
		}
	@PostMapping("/Payment")
	public Payment addInfo(@RequestBody Payment b)
	{
		return stpService.savepayment(b);
		}
	@PostMapping("/Contact")
	public Contact addInfo(@RequestBody Contact c)
	{
		return stmService.savecontact(c);
		}
	@GetMapping("/showDetails")
		public List<Bank>fetchdetails(){
			return stuService.getDetails();
			}
	@GetMapping("/showlogin")
	public List<login>fetchDetail(){
		return stdService.getlogin();
		}
	@GetMapping("/showContact")
	public List<Contact>fetchDetai(){
		return stmService.getcontact();
		}
	@GetMapping("/showPayment")
		public List<Payment>fetchDeta(){
			return stpService.getpay();
			}
		@PutMapping("/UpdateDetails")
		public Bank UpdateInfo(@RequestBody Bank st1){
			return stuService.UpdateDetails(st1);
			}
		@PutMapping("/Updatelogin")
		public login UpdateInfo(@RequestBody login a1){
			return stdService.Updatelogin(a1);
			}
		@PutMapping("/UpdateContact")
		public Contact UpdateInfo(@RequestBody Contact c1){
			return stmService.Updatecontact(c1);
			}
		@PutMapping("/UpdatePayment")
		public Payment UpdateInfo(@RequestBody Payment b1){
			return stpService.Updatepayment(b1);
			}
		@DeleteMapping("/Delde/{id}")
		public String deleteInfo (@PathVariable("id")int id) {
			stuService.deleteDetails(id);
			return "Deleted details";
			}
		@DeleteMapping("/Dello/{id}")
		public String deleteInfo1 (@PathVariable("id")int id) {
			stdService.deleteLogin(id);
			return "Deleted details";
			}
		@DeleteMapping("/Delco/{id}")
		public String deleteInfo2 (@PathVariable("id")int id) {
			stmService.deleteContact(id);
			return "Deleted details";
			}
		@DeleteMapping("/Delpay/{id}")
		public String deleteInfo3 (@PathVariable("id")int id) {
			stpService.deletePay(id);
			return "Deleted details";
			}
		
		}
