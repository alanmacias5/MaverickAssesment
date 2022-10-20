import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CoursesAddFormComponent } from './courses-add-form.component';

describe('CoursesAddFormComponent', () => {
  let component: CoursesAddFormComponent;
  let fixture: ComponentFixture<CoursesAddFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CoursesAddFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CoursesAddFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
