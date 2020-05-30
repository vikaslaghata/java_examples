import { Component, OnInit } from '@angular/core';
import { BookService } from './book.service';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {
  books = [];
  constructor(private bookService: BookService) { }

  ngOnInit(): void {
  console.log("Requesting to server ===== >>");
    this.bookService.sendGetRequest().subscribe((data: any[])=>{
          console.log(data);
          this.books = data;
        })
  }


}
