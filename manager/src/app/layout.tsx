import "bootstrap/dist/css/bootstrap.css";

export const metadata = {
  title: "Book Store Management System",
  description: "This is my project. A Stage for learning micro-service",
  icons: {
    icon: "/books-piled.png",
  },
};

export default function RootLayout({
  children,
}: {
  children: React.ReactNode;
}) {
  return (
    <html lang="en">
      <body>{children}</body>
    </html>
  );
}
